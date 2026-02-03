# ☕ Web Services with Spring Boot & JPA

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Render](https://img.shields.io/badge/Render-%2346E3B7.svg?style=for-the-badge&logo=render&logoColor=white)

## 📄 About

This project is a RESTful Web API built with **Java 21** and **Spring Boot**. It simulates an e-commerce system domain, handling Users, Orders, Products, Categories, and Payments.

The main goal was to implement a robust backend architecture using **Object-Relational Mapping (ORM)** with Hibernate/JPA, following best practices like layered architecture, exception handling, and dependency injection.

The application is fully containerized with **Docker** and deployed in a cloud environment.

## 🚀 Live Demo

The application is deployed and running on Render with a PostgreSQL database.

🔗 **Base URL:** [https://project-springboot4-jpa.onrender.com](https://project-springboot4-jpa.onrender.com)

> **Note:** The free tier on Render spins down after inactivity. The first request might take 50+ seconds to wake up the server.

## 🛠 Technologies & Tools

- **Java 21 (LTS)** - Core language.
- **Spring Boot 3** - Framework for rapid application development.
- **Spring Data JPA** - For ORM and database interactions.
- **PostgreSQL** - Production database.
- **H2 Database** - In-memory database for development/testing profiles.
- **Docker** - Containerization for consistent deployment.
- **Maven** - Dependency management.
- **Render** - Cloud PaaS for deployment.

## ⚙️ Key Features

- **CRUD Operations:** Complete management for Users, Products, Categories, and Orders.
- **Domain Model:** Complex relationships (One-to-Many, Many-to-Many) mapping.
- **Database Seeding:** Automatic data instantiation for testing.
- **Error Handling:** Custom exception handling for better API responses (e.g., `ResourceNotFoundException`).
- **Profile Management:** Distinct configurations for `test` (H2) and `prod` (PostgreSQL/Docker).

## 🗂 Domain Model

The system is based on the following entities and relationships:

- **User** (1) <---> (N) **Order**
- **Order** (1) <---> (1) **Payment**
- **Order** (N) <---> (N) **Product** (via OrderItem)
- **Product** (N) <---> (N) **Category**
