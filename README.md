# Headless CMS Project

## Overview
This project is a headless CMS (Content Management System) built using Java Spring Boot and MongoDB. It provides RESTful API endpoints for managing products in an e-commerce application.

## Features
- CRUD operations for managing products (Create, Read, Update, Delete)
- API endpoints for retrieving products, creating new products, updating existing products, and deleting products
- MongoDB integration for storing product data

## Prerequisites
- Java Development Kit (JDK) 17 or higher
- Maven build tool
- MongoDB installed and running on localhost

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/YashPaliwal000/headless-cms.git
   cd headless-cms

   mvn clean install
   mvn spring-boot:run
   ```

The application will start, and the API will be accessible at http://localhost:8080/api/products

API Endpoints
```GET /api/products: Retrieve all products

GET /api/products/{id}: Retrieve a product by ID

POST /api/products: Create a new product

PUT /api/products/{id}: Update an existing product

DELETE /api/products/{id}: Delete a product by ID
```
Sample JSON

```{
  "name": "Smartphone",
  "description": "A high-end smartphone with advanced features.",
  "price": 699.99,
  "quantity": 100,
  "category": "Electronics"
}
```

Dependencies

```
Spring Boot
Spring Data MongoDB
Lombok
Springfox Swagger (for API documentation)
```
Contributing
Contributions are welcome! Please feel free to submit pull requests or open issues for any improvements or bug fixes.



