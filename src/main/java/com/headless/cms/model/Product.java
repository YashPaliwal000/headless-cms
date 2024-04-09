package com.headless.cms.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "products")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;
    private Map<String, Object> customFields;
    
}
