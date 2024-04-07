package com.headless.cms.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.headless.cms.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    
}