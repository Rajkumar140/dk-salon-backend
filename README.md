DK Salon Backend (Spring Boot API)

A robust and scalable backend application built using **Spring Boot** to manage contact form data for the DK Salon full-stack web application. This service handles storing, retrieving, and managing customer contact information efficiently.

---

Overview

The **DK Salon Backend** is a RESTful API designed to handle user contact submissions from the frontend application. It follows a clean layered architecture using Controller, Service, and Repository patterns.

---

Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* REST API
* Maven

---

Features

* Create new contact entries (name, email, phone, message)
* Delete contact entries
* Automatic timestamp tracking (createdAt, updatedAt)
* Clean and maintainable layered architecture
* CORS configuration for frontend integration

---

Project Structure

```
dk-salon-backend
│── controller
│   └── ContactController.java
│
│── service
│   ├── ContactService.java
│   └── SelfStoreContactService.java
│
│── repository
│   └── ContactRepository.java
│
│── modals
│   ├── BaseModel.java
│   └── Contact.java
```

---

API Endpoints

Base URL

```
http://localhost:8080/product
```

1. Test API

```
GET /hello
```

Response:

```
Hello, Contact Information is running!
```

---

Create Contact

```
POST /
```

Request Body:

```json
{
  "name": "Rajkumar",
  "email": "raj@email.com",
  "phone": "9876543210",
  "message": "I want to book a haircut"
}
```

Response:

* Status: `201 Created`

---

Delete Contact

```
DELETE /{id}
```

Response:

* Status: `204 No Content`

---

Database Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dk_salon_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

How to Run the Project

1. Clone the repository:

```
git clone https://github.com/your-username/dk-salon-backend.git
```

2. Navigate to the project folder:

```
cd dk-salon-backend
```

3. Run the application:

```
mvn spring-boot:run
```

4. Server will start at:

```
http://localhost:8080
```

---

Frontend Repository

You can find the frontend application here:
https://github.com/Rajkumar140/dk-salon-frontend

---

Future Improvements

* Add validation using Hibernate Validator
* Implement update API
* Add pagination and filtering
* Add authentication (JWT)
* Deploy using Docker & Cloud

---

Author

**Rajkumar J**

---

License

This project is open-source and available under the MIT License.
