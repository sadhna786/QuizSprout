# QuizSprout

QuizSprout is a Spring Boot-based web application designed for managing quizzes and questions through a RESTful API. It supports various CRUD operations for quizzes and integrates with a PostgreSQL database for persistent data storage. You can test the API endpoints using Postman.

## Features

- **Quiz and Question Management**: Create, retrieve, update, and delete quizzes and their questions.
- **Database Persistence**: Stores quiz and question data in a PostgreSQL database.
- **RESTful API**: Accessible endpoints for seamless integration with frontend applications or API clients like Postman.

## Technologies Used

- **Java** - Core language.
- **Spring Boot** - Backend framework for easy setup and rapid development.
- **PostgreSQL** - Database for storing quiz data.
- **Maven** - Project management and dependency resolution.
- **Postman** - For testing API endpoints.

## Project Structure

- **`src/main/java/com/quizapp/quizapp`** - Contains the core source files:
  - **Controllers**: REST API controllers like `QuizController` and `QuestionController`.
  - **DAO**: Data Access Objects for interacting with PostgreSQL.
  - **Service Layer**: Handles business logic between controllers and DAOs.
- **`pom.xml`** - Maven configuration file.
  
# License

**This project is licensed under the MIT License.**
