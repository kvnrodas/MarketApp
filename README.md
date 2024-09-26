# MarketApp

MarketApp is a simple Spring Boot application that manages products and categories. It provides APIs for creating, reading, updating, and deleting products and their associated categories, with PostgreSQL as the database. This project also uses MapStruct for object mapping.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Features

- CRUD operations for products and categories
- Object mapping using MapStruct
- Database integration with PostgreSQL
- Unit testing using JUnit

## Technologies

- **Java 21**
- **Spring Boot 3.3.2**
- **PostgreSQL 42.7.3**
- **MapStruct 1.6.0**
- **JUnit**

## Prerequisites

To run this project, you need to have the following installed:

- **Java 21** or higher
- **PostgreSQL** (Ensure you have a PostgreSQL instance running)
- **Gradle** (Optional, for building the project manually)

API Endpoints

Categories
GET /categories - Retrieve a list of all categories
GET /categories/{id} - Retrieve a category by ID
POST /categories - Create a new category
PUT /categories/{id} - Update a category by ID
DELETE /categories/{id} - Delete a category by ID
Products

GET /products - Retrieve a list of all products
GET /products/{id} - Retrieve a product by ID
POST /products - Create a new product
PUT /products/{id} - Update a product by ID
DELETE /products/{id} - Delete a product by ID



### Key points included:
- **Project description**: A brief explanation of what the app does.
- **Technologies used**: The tools and libraries used in the project.
- **Prerequisites and installation instructions**: How to clone, set up, and run the application.
- **API Endpoints**: Sample endpoints to interact with the product and category entities.
- **Testing**: Instructions on how to run the tests.
- **License**: A placeholder for the project's license.

Let me know if you'd like to adjust any sections or add more details!


