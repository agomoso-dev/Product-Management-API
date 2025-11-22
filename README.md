---

# Product-Management-API

A simple and structured **REST API for product management**, built with **Spring Boot**.
This project demonstrates clean architecture, DTO usage, input validation, global exception handling, and API documentation with Swagger.

---

## Features

* CRUD operations for products (Create, Read, Update, Delete)
* Layered architecture (Controller, Service, Repository)
* DTOs for request/response models
* Input validation using `@Valid` and Jakarta Validation annotations
* Global exception handling with `@ControllerAdvice`
* Swagger/OpenAPI documentation
* Optional persistence integration (H2 or MySQL)

---

## Requirements

* Java 17 or higher
* Maven or Gradle
* An IDE such as IntelliJ IDEA, Spring Tools Suite, or VS Code

---

## Installation & Setup

1. **Clone the repository**

```bash
git clone https://github.com/agomosodev/product-management-api.git
cd product-management-api
```

2. **Build the project**

```bash
mvn clean install
```

or

```bash
./mvnw clean install
```

3. **Run the application**

```bash
mvn spring-boot:run
```

or using the wrapper:

```bash
./mvnw spring-boot:run
```

4. **Access the API**

By default, the API runs at:

```
http://localhost:8080
```

5. **Swagger API Documentation**

Available at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Project Structure

```
src/main/java/com.example.productapi
 ├── controller     # REST endpoints
 ├── dto            # Request/response objects
 ├── service        # Business logic
 ├── repository     # Data access (optional with JPA)
 ├── model          # Entity/Domain models
 ├── exception      # Custom exceptions & global handler
 └── config         # Swagger configuration
```

---

## Technologies Used

* **Spring Boot**
* **Spring Web**
* **Spring Validation**
* **Springdoc OpenAPI (Swagger UI)**
* **Lombok**
* (Optional) Spring Data JPA + H2/MySQL

---

## 🧪 Input Validation Rules

* `@NotBlank` for product names
* `@Min` or `@Positive` for prices and quantities
* Automatic error formatting through global exception handler
* Returns meaningful HTTP error messages for invalid input

---

## Global Error Handling

The API includes a global exception handler using:

```
@RestControllerAdvice
```

It catches:

* Validation errors
* Product not found exceptions
* Internal server errors

And returns clear JSON responses with:

* timestamp
* message
* status code
* path

---

## Future Improvements

* Authentication & authorization
* Pagination and filtering
* Product categories
* Full database integration
* Docker support
* Integration tests with Testcontainers

---

## License

This project is open-source and free to use.

---

## Author

Antonio Jesús Gómez Osorio
([agomosodev](https://github.com/agomosodev))
