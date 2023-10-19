<h1 align = "center"> DoctorApp </h1>

 DoctorApp aims to streamline the appointment scheduling process, enhance doctor-patient communication, and improve overall healthcare accessibility. With its user-friendly interface and robust features, the platform promises to become a valuable tool for doctors and patients alike.

>## Framework used

* Spring Boot
---
>## Dependencies
The following dependencies are required to run the project:

* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* javax -mail
* Swagger
---


>## Database Configuration
* To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/doctorpatientdb
spring.datasource.username=<your_database_username>
spring.datasource.password=<your_database_password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

``` 
---
>## Language Used
* Java

---

>## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---


>## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
>## API Endpoints

### Adding a Doctor
* Endpoint: POST /api/doctors
* Request Body: JSON representing the doctor details
* Example:

```
{
  "id": 1,
  "name": "james",
  "city": "banglore",
  "email": "james@example.com",
  "phoneNumber": "8989898989",
  "speciality": "ORTHOPEDIC"
}

```

### Adding a Patient
* Endpoint: POST /api/patients
* Request Body: JSON representing the patient details
* Example:
```
{
  "id": 1,
  "name": "Dane Smith",
  "city": "banglore",
  "email": "janesmith@example.com",
  "phoneNumber": "9999999999",
  "symptom": "BACK_PAIN"
}

```
---

>## Project Summary
* DoctorApp is a web-based application that serves as a bridge between doctors and patients, providing a platform for seamless appointment scheduling and management. The project offers a RESTful API for creating and deleting appointments, streamlining the process and enhancing patient-doctor communications
---
>## Author

👤 **srinath katta**

* GitHub: [Saikumar theppa](https://gist.github.com/Srinathkatta)

---

>## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---

>## Show your support

Give a ⭐️ if this project helped you!
    
---
