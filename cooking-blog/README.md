# Cooking Blog Application

## Overview
This is a Spring Boot application for a cooking blog where users can view recipes and leave comments with timestamps and their name.

## Features
- View recipes
- Detailed view of each recipe
- Add, edit, and delete recipes

## Technologies Used
- Spring Boot
- Thymeleaf
- Maven
- Java

## Project Structure
```
cooking-blog
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cookingblog
│   │   │           ├── CookingBlogApplication.java
│   │   │           ├── controller
│   │   │           │   └── HomeController.java
│   │   │           ├── model
│   │   │           │   └── Recipe.java
│   │   │           └── service
│   │   │               └── RecipeService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           └── index.html
│   └── test
│       ├── java
│       │   └── com
│       │       └── cookingblog
│       │           └── CookingBlogApplicationTests.java
│       └── resources
├── pom.xml
└── README.md
```

## How to Run
1. Install Java 17, MySQL
2. Create a database named `cooking_blog`
3. Update `application.properties` with your MySQL credentials
4. Run:
   ```bash
   mvn spring-boot:run
5. Open your web browser and go to `http://localhost:8080` to view the application.

## Usage
- The home page will display recipes and a comment section.

