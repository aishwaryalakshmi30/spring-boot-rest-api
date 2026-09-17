# Spring Boot REST API

A simple REST API project built using **Java and Spring Boot** to perform basic CRUD operations on user data.

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Maven
* REST API
* VS Code / IntelliJ IDEA

## Project Structure

```text
src
└── main
    └── java
        └── com.example.demo
            ├── DemoApplication.java
            ├── User.java
            ├── UserController.java
            └── UserService.java
```

## Features

The application provides four REST API operations:

| Method | Endpoint      | Description             |
| ------ | ------------- | ----------------------- |
| GET    | `/users/{id}` | Get a user by ID        |
| POST   | `/users`      | Add a new user          |
| PUT    | `/users/{id}` | Update an existing user |
| DELETE | `/users/{id}` | Delete a user           |

## API Details

### 1. GET User

Retrieves user details using the user ID.

**Request:**

```http
GET http://localhost:8081/users/1
```

**Example Response:**

```json
{
  "id": 1,
  "name": "Aishu",
  "email": "aishu@gmail.com"
}
```

---

### 2. POST User

Adds a new user to the user list.

**Request:**

```http
POST http://localhost:8081/users
Content-Type: application/json
```

**Request Body:**

```json
{
  "id": 3,
  "name": "Priya",
  "email": "priya@gmail.com"
}
```

---

### 3. PUT User

Updates an existing user using the user ID.

**Request:**

```http
PUT http://localhost:8081/users/3
Content-Type: application/json
```

**Request Body:**

```json
{
  "id": 3,
  "name": "Priya Updated",
  "email": "priya.updated@gmail.com"
}
```

---

### 4. DELETE User

Deletes a user using the user ID.

**Request:**

```http
DELETE http://localhost:8081/users/3
```

**Example Response:**

```text
User deleted successfully
```

## Running the Application

### 1. Clone the repository

```bash
git clone https://github.com/aishwaryalakshmi30/spring-boot-rest-api.git
```

### 2. Open the project

Open the project in **VS Code** or **IntelliJ IDEA**.

### 3. Run the application

Using the Maven wrapper:

**Windows:**

```powershell
.\mvnw.cmd spring-boot:run
```

The application runs on:

```text
http://localhost:8081
```

## Testing the APIs

The project contains a `requests.http` file that can be used to test the REST APIs directly from VS Code or IntelliJ IDEA.

The API operations can be tested in the following order:

```text
POST → PUT → DELETE → GET
```

## Data Storage

This project currently uses an **in-memory ArrayList** to store user data.

No external database is required.

## Author

**Aishwarya Lakshmi**

GitHub:
https://github.com/aishwaryalakshmi30
