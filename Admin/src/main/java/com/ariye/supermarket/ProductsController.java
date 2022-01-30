package com.ariye.supermarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsController {

    @Autowired
    private ProductsDao productsDao;

    public Product getProduct(String name, int amount) throws Exception {
        
        Product product = productsDao.findByName(name);
        if(product.getAmountInStock() < amount) {
            throw new Exception("Not enought products in stock");
        }
        int newAmount = (product.getAmountInStock() - amount);
        product.setAmountInStock(newAmount);
        productsDao.save(product);

        return product;
    }
    
}