# Flight Reservation API

## Project Overview

This is a lightweight RESTful API built with Spring Boot for managing flight reservations. It provides core functionalities for searching flights, making new bookings, and managing existing reservations. Designed as a backend service, it exposes endpoints for seamless integration with a frontend application or other services.

## Features

* **Flight Management:** (Assumed based on "Flight_services")
    * Search for available flights based on criteria (e.g., origin, destination, date).
    * Retrieve details of a specific flight.
* **Booking Management:**
    * Create new flight bookings.
    * Retrieve details of a specific booking.
    * (Potentially) Cancel or update existing bookings.
* **Passenger Information:** (Assumed to be part of booking)
    * Manage passenger details associated with bookings.
* **RESTful Architecture:** Clear, intuitive API endpoints following REST principles.

## Technologies Used

* **Java 17+** (or your specific Java version)
* **Spring Boot:** Framework for rapid application development.
    * **Spring Web:** For building RESTful APIs.
    * **Spring Data JPA:** For database interaction and ORM (Object-Relational Mapping).
    * **(Likely) H2 Database:** In-memory database for quick local development and testing. (Can be easily swapped for external databases like MySQL, PostgreSQL, etc.)
* **Maven:** Dependency management and build automation tool.
* **Lombok:** (Optional, but common) To reduce boilerplate code (e.g., getters/setters).

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 17 or higher
* Maven 3.x
* (Optional) An IDE like IntelliJ IDEA, VS Code, or Eclipse with Spring Boot support.

### Installation

1.  **Clone the repository:**

    ```bash
    git clone [https://github.com/Parth-sarthidubey/Flight_services.git](https://github.com/Parth-sarthidubey/Flight_services.git)
    cd Flight_services
    ```

2.  **Build the project:**

    ```bash
    mvn clean install
    ```

### Running the Application

You can run the application directly using Maven Spring Boot plugin:

```bash
mvn spring-boot:run
