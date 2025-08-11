1️⃣ What is a Repository?
In Java (and other languages), a Repository is a design pattern used to separate data access logic from business logic.

Instead of having your service or controller directly talk to the database, they talk to a repository interface.

The repository acts like a collection in memory, but actually fetches/stores data from a database, file, or API.

2️⃣ Why use it?
Separation of concerns → Keeps your data layer separate from business rules.

Testability → You can mock the repository in unit tests.

Flexibility → Swap the underlying data source without changing the business code.

Cleaner code → All data access code is in one place.

3️⃣ Basic Structure in Java
Step 1 — Create an Entity
java
Copy
Edit
public class Product {
    private int id;
    private String name;
    private double price;

    // Constructor, getters, setters
}
Step 2 — Create a Repository Interface
java
Copy
Edit
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    void addProduct(Product product);
    Optional<Product> getProductById(int id);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(int id);
}
Step 3 — Implement the Repository (In-Memory Example)
java
Copy
Edit
import java.util.*;

public class InMemoryProductRepository implements ProductRepository {
    private final Map<Integer, Product> storage = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        storage.put(product.getId(), product);
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void updateProduct(Product product) {
        storage.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(int id) {
        storage.remove(id);
    }
}
4️⃣ Repository with Database (JDBC Example)
java
Copy
Edit
import java.sql.*;
import java.util.*;

public class JdbcProductRepository implements ProductRepository {
    private final Connection connection;

    public JdbcProductRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addProduct(Product product) {
        try (PreparedStatement stmt = connection.prepareStatement(
                "INSERT INTO products (id, name, price) VALUES (?, ?, ?)")) {
            stmt.setInt(1, product.getId());
            stmt.setString(2, product.getName());
            stmt.setDouble(3, product.getPrice());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Product> getProductById(int id) {
        try (PreparedStatement stmt = connection.prepareStatement(
                "SELECT * FROM products WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return Optional.of(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    // Implement getAllProducts(), updateProduct(), deleteProduct() similarly
}
5️⃣ Using the Repository
java
Copy
Edit
public class App {
    public static void main(String[] args) {
        ProductRepository repo = new InMemoryProductRepository();
        
        repo.addProduct(new Product(1, "Laptop", 79999));
        repo.addProduct(new Product(2, "Phone", 29999));

        repo.getAllProducts().forEach(p -> 
            System.out.println(p.getName() + " - " + p.getPrice())
        );
    }
}
6️⃣ In Real Projects
Often used with Spring Data JPA, where you just create an interface like:

java
Copy
Edit
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> { }
…and Spring auto-generates the implementation.