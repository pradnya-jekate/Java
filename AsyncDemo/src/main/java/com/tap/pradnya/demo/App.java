package com.tap.pradnya.demo;

import java.util.List;
import java.util.Optional;
import com.tap.pradnya.Repository.*;
import com.tap.pradnya.Entity.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    
    {
       ProductRepository repo=new ProductRepositoryImpl();
       
       //add products
       repo.addProduct(new Product(1, "Laptop", 79999)).get();
       repo.addProduct(new Product(2,"Phone",29999)).get();

       //get all
       List<Product> all=repo.getAllProducts().get();
       System.out.println("All Products:" +all);

       //update
       repo.updateProduct(new Product(2,"SmartPhone",24999)).get();

       //get by id
       Optional<Product> p=repo.getProductById(2).get();
       System.out.println("Product with Id 2:"+p);

       //delete
       repo.deleteProduct(1).get();

       //Final List
       System.out.println("Final Products:" +repo.getAllProducts().get());

    }
    
}
