# microservice-create-category

This project is a microservice created with Java and Spring Boot that allows you to create categories in a database. The service is configured to run inside a Docker container, making it easy to deploy and portable.

## Technologies Used
- Java 17
- Spring Boot
- Docker
- MySQL (for the database)

## Description

This microservice allows you to perform CRUD operations on categories in a database. The main endpoint it provides is to **CREATE** categories.

## Requirements

To run this project, you need to have the following programs installed:

- [Docker]
- [Visual Studio Code]
- **Java 17** or higher
- **Maven** for building the project

## Dependencies

- **Spring Boot**: The main framework for building Java-based web applications.
- **Spring Data JPA**: For interacting with the database.
- **MySQL**: Database for storing categories.
- **Docker**: For containerizing the application.

## Steps to Run the Project

### 1. Clone the Repository

If you haven't downloaded the project yet, clone or download it from GitHub:

```bash
git clone https://github.com/Karolpineda/microservice-create-category.git
```

### 2. Build the Docker Image
In the project directory, run the following command to build the Docker image:
```bash
docker build -t <your-username>/microservice-create-product

```

### 3. Run the Project
After building the image, run the project with this command:
```bash
npm run start
```
The application will run at: http://localhost:8085

## API Usage
### Create a CATEGORY
Endpoint: POST /api/products/

This endpoint allows you to create a category in the database using the provided data.
