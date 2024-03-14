package com.example.swaggerdemoexample.service;



import com.example.swaggerdemoexample.entity.Product;

import java.util.List;


public interface ProductService {



    List<Product> findAll();
    //@RequestParam
    //List<Product> findAllProducts(int length);
    Product insertProductIntoDatabase(Product product);

    Product getProductById(int id );

    Product updateProduct(Product product, int id);

    Product deleteProduct(int id);
}
