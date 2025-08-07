JDBC is a Java API that allows Java programs to connect and interact with databases using SQL.

🔧 JDBC Architecture
DriverManager – Manages JDBC drivers.

Connection – Establishes a connection to the database.

Statement / PreparedStatement – Sends SQL commands to the database.

ResultSet – Represents results returned from a query.

🪛 JDBC Steps (Lifecycle)
Load JDBC Driver (optional for modern Java)

Establish a connection

Create a statement

Execute query or update

Process results

Close all resources

📌 JDBC Code Example (MySQL)
👇 Example: Select from a MySQL database
java
Copy
Edit
import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        try {
            // Step 1: Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Step 2: Prepare SQL query
            String sql = "SELECT id, name FROM employees";
            Statement stmt = conn.createStatement();

            // Step 3: Execute query
            ResultSet rs = stmt.executeQuery(sql);

            // Step 4: Process result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Step 5: Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
📦 Maven Dependency (MySQL JDBC Driver)
Add this to your pom.xml if you're using Maven:

xml
Copy
Edit
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.4.0</version>
</dependency>
🧠 JDBC Interfaces Overview
Interface	Description
Driver	Interface for database driver
Connection	Represents DB connection
Statement	Executes static SQL queries
PreparedStatement	Executes parameterized SQL queries (safer)
CallableStatement	Executes stored procedures
ResultSet	Holds query result data

🔐 Why Use PreparedStatement?
✅ Prevents SQL injection
✅ Easier to pass parameters (e.g., stmt.setInt(1, id);)

🔄 Common JDBC Methods
java
Copy
Edit
conn.createStatement();
conn.prepareStatement(sql);
stmt.executeQuery();
stmt.executeUpdate();
rs.next();
rs.getInt("column_name");
rs.getString("column_name");
Let me know if you want help:

Writing insert/update/delete operations

Using JDBC with another database (e.g., PostgreSQL, Oracle)

Structuring JDBC with DAO design pattern