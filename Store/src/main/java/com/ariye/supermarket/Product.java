package com.ariye.supermarket;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Product implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    private int amountInStock;
    private float price;

    public Product() {
    }

    public Product(String name, int amountInStock, float price) {
        this.name = name;
        this.amountInStock = amountInStock;
        this.price = price;
    }

    public Product(Long id, String name, int amountInStock, float price) {
        this.id = id;
        this.name = name;
        this.amountInStock = amountInStock;
        this.price = price;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountInStock() {
        return this.amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
}
