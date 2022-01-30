package com.ariye.supermarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductsApi {

    @Autowired
    private ProductsController productsController;

    @GetMapping
    public Product getProduct(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return productsController.getProduct(name);
    }

    @PostMapping
    public void addProduct(String name, int amount, float price) throws Exception {
        productsController.addProduct(name, amount, price);
    }

    @PutMapping
    public void updateProduct(String name, Integer amount, Float price) {
        productsController.updateProduct(name, amount, price);
    }

    @DeleteMapping
    public void deleteProduct(String name) {
        productsController.deleteProduct(name);
    }


}
