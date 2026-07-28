# 🏢 RRHH Personal API

REST API built using a **Modular Monolith** architecture, applying **Domain-Driven Design (DDD)**, **Hexagonal
Architecture**, and **CQRS**. It manages the end-to-end workflow for people and employees, publishing domain events to
external microservices.

---

## 📐 Architecture & Design

The system is structured into loosely coupled modules bounded by contextual limits (Bounded Contexts):

* **`shared`**: Contains common infrastructure, shared Value Objects, cross-cutting utilities, and event contracts.
* **`person`**: Manages the bounded context for basic personal data and identity.
* **`employee`**: Handles the employee lifecycle, employment files, and hiring records.

### Core Principles

* **Domain-Driven Design (DDD)**: Rich domain modeling, strict use of **Value Objects** for validation and immutability,
  and well-defined aggregates.
* **Hexagonal Architecture (Ports and Adapters)**: Total decoupling of business logic from external frameworks and
  databases.
* **CQRS (Command Query Responsibility Segregation)**: Clear separation between read and write operations.
* **Event-Driven Architecture (EDA)**: Publishing domain events upon key business actions (e.g., new employee
  registration).

---

## 🛠️ Tech Stack

* **Language & Framework:** Java 21 / Spring Boot
* **Architecture:** Modular Monolith / Hexagonal Architecture
* **Persistence:** PostgreSQL / Spring Data JPA
* **Messaging:** Apache Kafka / RabbitMQ
* **Build & Tools:** Gradle / Lombok / Docker

---

## 🔄 Integration Flow

When a new record is created in the `employee` module:

1. The domain validates business rules and immutability via **Value Objects**.
2. The new employee record is persisted into the database.
3. A domain event (`EmployeeCreatedEvent`) is published.
4. The notification microservice consumes this event asynchronously to notify the employee.

---

## 🚀 Local Execution

```bash
# Clone the repository
git clone [https://github.com/alejandro-ahmad/rrhh-personal-api.git](https://github.com/alejandro-ahmad/rrhh-personal-api.git)

# Spin up local environment with Docker (Database & Brokers)
docker-compose up -d

# Run the application
./gradlew bootRun
