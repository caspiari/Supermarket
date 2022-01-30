package com.ariye.supermarket;

import com.ariye.supermarket.Product;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Product, Long> {
    
    Product findByName(String name);

    @Transactional
    @Modifying
    @Query("delete from Product where name = ?1")
    void deleteByName(String name);

}
