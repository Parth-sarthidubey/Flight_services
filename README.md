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
```

The application will start on port 8080 by default. You can access the API at http://localhost:8080.

Database Configuration
By default, this project might be configured to use an H2 in-memory database for ease of development. You can access the H2 console at http://localhost:8080/h2-console (make sure to set the JDBC URL as configured in application.properties, usually jdbc:h2:mem:testdb).

To connect to an external database (e.g., MySQL, PostgreSQL), you'll need to:

Add the appropriate database driver dependency to your pom.xml.

Update src/main/resources/application.properties (or application.yml) with your database connection details (URL, username, password).

API Endpoints (Example)
Here are some example API endpoints you can expect in this service:

Flights:

GET /api/flights - Retrieve all available flights.

GET /api/flights/{id} - Retrieve details of a specific flight by ID.

GET /api/flights/search?origin=XYZ&destination=ABC&date=YYYY-MM-DD - Search for flights.

Bookings:

POST /api/bookings - Create a new flight booking.

Request Body Example (JSON):

JSON

{
  "flightId": "some-flight-id",
  "passengerName": "John Doe",
  "email": "john.doe@example.com",
  "seats": 1
}
GET /api/bookings - Retrieve all bookings (might require authentication in a real app).

GET /api/bookings/{id} - Retrieve details of a specific booking by ID.

(Potential) DELETE /api/bookings/{id} - Cancel a booking.

Health Check:

GET /actuator/health (if Spring Boot Actuator is included) - Check application health.









