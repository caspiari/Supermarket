package com.ariye.supermarket;

import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Product, Long> {
    
    Product findByName(String name);

    void deleteByName(String name);
    
}
