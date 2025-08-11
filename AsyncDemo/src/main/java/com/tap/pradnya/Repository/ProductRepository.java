package com.tap.pradnya.Repository;

//package com.tap.pradnya.demo.Repository;
//package com.tap.pradnya.Entity;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import com.tap.pradnya.Entity.*;
public interface ProductRepository
{
        CompletableFuture<Void>addProduct(Product product);
        CompletableFuture<Optional<Product>>getProductById(int id);
        CompletableFuture<List<Product>>getAllProducts();
        CompletableFuture<Void>updateProduct(Product product);
        CompletableFuture<Boolean>deleteProduct(int id);
    
    
}
