# plt-string-management

- Author: Diego Marinho Almeida
- Since: Dez/2024
- Version: 1.0

## Stack
- Java 17
- Maven (3.6.3 ou posterior)
- Spring Boot 3.1.4
- Base de dados H2
- Lombok
- Swagger

# String Management Service

This is a RESTful service implemented in Java 17 using Spring Boot. The service allows managing a database of strings with CRUD operations and search functionality.

## Features

1. Challenge Description
   Given a string str, find the length of the longest substring without repeating characters.
   Examples
   For the string "ABDEFGABEF", the longest substring without repeating characters are "BDEFGA" and "DEFGAB", both with a length of 6.
   For the string "BBBB", the longest substring without repeating characters is "B", with a length of 1.
   For the string "GEEKSFORGEEKS", the longest substrings are of length 7.
2. Additional Requirement
   Please include a second part:
   Additional Task: Return all the longest substrings (not just the length) in case multiple substrings have the same maximum length.
   Example:
   For the string "GEEKSFORGEEKS", the result should be a list containing the substrings ["EKSFORG", "KSFORGE"], both of length 7.
   Requirements
   • The code must be written in Java.
   • You are expected to upload your solution to a public GitHub repository under your name.
   • The challenge must be completed and submitted within one hour of receiving this email.
   Recommended Best Practices
- Code Readability
- Algorithm Efficiency
- Documentation and Comments.

## Endpoints

### Base URL
`/api/substrings`

### API Endpoints
| HTTP Method | Endpoint   | Description       |
|-------------|------------|-------------------|
| `GET`       | `/longest` | List all strings. |

### Swagger UI
For easy exploration and testing of the API, you can access the Swagger UI documentation at the following URL:

[Swagger UI Documentation](http://localhost:8080/swagger-ui/index.html#/)

This interface provides an interactive way to test the API endpoints directly from your browser.

## Technology Stack
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate Validator**
- **H2 (in-memory) database** (for testing)

## Setup

### Prerequisites
- JDK 17 or higher
- Maven 3.8 or higher

### Steps to Run the Application in MAVEN
1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run`.
4. The service will be available at `http://localhost:8080/string`.
5. You can access the Swagger UI at `http://localhost:8080/swagger-ui/index.html#/`.

---

### Build and Run the Application in Docker

### Steps to Build and Run the Application in Docker

1. Clone the repository.
2. Navigate to the project directory.
3. USe the `Dockerfile` in the root of the project.
4. Build the Docker image by running:

    ```bash
    docker build -t string-management .
    ```

5. Run the Docker container using:

    ```bash
    docker run -p 8080:8080 string-management
    ```

6. You can access the Swagger UI at `http://localhost:8080/swagger-ui/index.html#/`.

---

## Contributions
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.