# Spring Boot REST API 🚀

A basic RESTful API built with **Spring Boot** demonstrating CRUD operations (GET, POST, PUT, DELETE) and database integration using **Spring Data JPA**.

---

## 🛠 Technologies Used
- ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring&logoColor=white)
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
- ![H2 Database](https://img.shields.io/badge/H2_Database-0078D7?style=flat&logo=h2&logoColor=white)
- ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=flat&logo=postman&logoColor=white)
- ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&logoColor=white)

---

## 📌 Features
- **CRUD Operations**: Implemented GET, POST, PUT, and DELETE endpoints.
- **Database Integration**: Configured using `application.properties`.
- **Layered Architecture**: Controller, Service, and Repository layers.

---

## 🚀 Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
2. Configure you Application.properties File :
   ```bash
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.username=sa
   spring.datasource.password=password
   spring.h2.console.enabled=true
4. Run the Application
   ```bash
   mvn spring-boot:run
5. Access the API at http://localhost:8080.

📡 API Endpoints
Method	Endpoint	Description
GET	/api/items	Fetch all items
GET	/api/items/{id}	Fetch an item by ID
POST	/api/items	Create a new item
PUT	/api/items/{id}	Update an item by ID
DELETE	/api/items/{id}	Delete an item by ID

🤝 Contributing
Contributions are welcome! Fork the repo, create a branch, and submit a pull request.

📜 License
This project is licensed under the MIT License. See LICENSE for details.

Made with ❤️ by Srivatsan
