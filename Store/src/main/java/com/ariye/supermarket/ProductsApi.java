package com.ariye.supermarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductsApi {

    @Autowired
    private ProductsController productsController;

    @PostMapping
    public void addProduct(@RequestParam("name") String name, @RequestParam("amount") int amount, @RequestParam("price") float price) throws Exception {

        productsController.addProduct(name, amount, price);
    }

}
