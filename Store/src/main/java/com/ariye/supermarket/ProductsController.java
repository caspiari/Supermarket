package com.ariye.supermarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsController {

    @Autowired
    private ProductsDao productsDao;

    public void addProduct(String name, int amount, float price) throws Exception {

        if(name == null || name == "") {
            throw new Exception("Name can't be null");
        }
        
        Product product = new Product(name, amount, price);
        productsDao.save(product);
    }
    
}