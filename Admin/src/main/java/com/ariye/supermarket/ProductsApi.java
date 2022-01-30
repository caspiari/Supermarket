package com.ariye.supermarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductsApi {

    @Autowired
    private ProductsController productsController;

    @GetMapping
    public Product getProduct(@RequestParam("name") String name, @RequestParam("amount") int amount) throws Exception {

        return productsController.getProduct(name, amount);

    }

}
