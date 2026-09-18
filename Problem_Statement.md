# Problem Statement

## 1. Title

School Bus Tracking and Parent Notification App

## 2. Domain

Transportation / School Transportation Management / Web Application

## 3. Who is the User? (3 user types, with roles)

### 1. Parent

* Register and log in to the platform.
* View their child's assigned bus and route.
* View bus location during an active trip.
* View pickup and drop-off stop details.
* Receive notifications about bus arrival, departure, and trip status.
* View current and previous trip information.

### 2. Bus Driver

* Register and log in to the platform.
* View assigned bus and route details.
* View assigned bus stops.
* Start and end a bus trip.
* Share the current bus location during an active trip.
* Update trip status.
* View daily trip information.

### 3. School Admin

* Manage registered users.
* Manage students and parents.
* Manage buses and drivers.
* Create and manage routes and bus stops.
* Assign students and drivers to buses.
* Manage daily trips.
* Monitor active bus trips.
* Manage transportation-related records.

## 4. What Problem Are We Solving?

Parents may face difficulties in knowing the current location and arrival status of their child's school bus. They may have to depend on phone calls or messages to contact the driver or school to know whether the bus has started, where it is currently located, or when it is expected to reach the pickup or drop-off point. This can result in unnecessary waiting and communication gaps.

School administrators may also find it difficult to manage students, parents, buses, drivers, routes, bus stops, and daily trips when transportation information is maintained through manual or disconnected processes.

This project provides a centralized platform where parents can track the assigned school bus and receive timely notifications, drivers can update trip information and location, and school administrators can manage and monitor the overall school transportation system.

## 5. Proposed Solution

The application will provide the following features:

* User registration and login
* Role-based authentication
* Parent profile and student information management
* School bus and route information
* Real-time bus location tracking
* Bus stop and pickup/drop-off management
* Trip start, status, and completion management
* Parent notifications for important bus events
* Driver trip and location management
* Student and parent management
* Bus and driver management
* Route and bus stop management
* Bus assignment management
* Active trip monitoring
* Trip history and records
* Admin dashboard

## 6. Core Entities / Database Tables

1. User
2. Parent
3. Student
4. Driver
5. Bus
6. Route
7. BusStop
8. Trip
9. Notification

## 7. User Roles & Permissions

| Role | Permissions |
|------|-------------|
| Parent | Register, login, manage profile, view child details, view assigned bus and route, track bus location, view trip status, receive notifications, view trip history |
| Driver | Login, view assigned bus and route, view bus stops, start and end trips, update trip status, share bus location, view daily trip information |
| School Admin | Manage users, students, parents, drivers, buses, routes, bus stops, assignments, trips, and monitor active transportation activities |

## 8. Success Criteria

* A new user should be able to register and log in successfully.
* Parents should be able to view their child's assigned bus and route.
* Parents should be able to view the bus location during an active trip.
* Parents should receive notifications for important bus trip events.
* Drivers should be able to start, update, and complete a trip.
* The system should record and update the bus location during an active trip.
* Admins should be able to manage students, parents, drivers, buses, routes, and bus stops.
* The system should prevent unauthorized users from accessing restricted features.
* Trip and transportation data should be stored reliably in the database.

## 9. Out of Scope

The following features are not included in the initial version:

* Actual operation or control of school buses
* Vehicle hardware installation
* Automatic vehicle driving or autonomous driving
* Direct control of the bus engine or vehicle systems
* Online payment processing
* Direct medical or emergency service integration
* Native Android/iOS application in the initial version
* Integration with external government transportation databases
* Real SMS or WhatsApp gateway integration in the initial version
* Advanced AI-based driver monitoring in the initial version
* Hardware-based accident detection in the initial version

## 10. Chosen Track

Java (Spring Boot)

### Technology Stack

* Frontend: React.js, HTML, CSS, JavaScript
* Backend: Java, Spring Boot
* Database: MySQL
* ORM: Spring Data JPA / Hibernate
* API: REST API
* Authentication: JWT
* Testing: Postman / JUnit
* Version Control: Git & GitHub

## Author

SIVANANDHINI G

B.Tech Information Technology
J. J. College of Engineering and Technology
