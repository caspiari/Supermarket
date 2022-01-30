package com.ariye.supermarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsController {

    @Autowired
    private ProductsDao productsDao;

    public Product getProduct(String name) {
        return productsDao.findByName(name);
    }
    
    public void addProduct(String name, int amount, float price) throws Exception {
        if(name == null || name == "") {
            throw new Exception("Name can't be null");
        }
        Product product = new Product(name, amount, price);
        productsDao.save(product);
    }

    public void updateProduct(String name, Integer amount, Float price) {
        Product product = productsDao.findByName(name);

        if(amount != null) {
            product.setAmountInStock(amount);
        }

        if(price != null) {
            product.setPrice(price);
        }

        productsDao.save(product);
    }

    public void deleteProduct(String name) {
        productsDao.deleteByName(name);
    }
    

    
}