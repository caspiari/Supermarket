package com.ariye.supermarket;

import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Product, Long> {
    
}
