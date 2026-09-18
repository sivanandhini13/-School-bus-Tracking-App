# School Bus Tracking and Parent Notification App

## 1. Introduction

The **School Bus Tracking and Parent Notification App** is a web-based application designed to improve the safety, visibility, and communication of school transportation.

The system allows parents to track the current location and status of their child's school bus and receive timely notifications about important trip events. Bus drivers can update trip status, while school administrators can manage students, buses, drivers, routes, and bus stops.

The application provides a centralized platform that connects **Parents, Drivers, and School Administrators** and helps reduce unnecessary waiting time and communication gaps.

---

## 2. Objective

The main objectives of the project are:

* To provide real-time school bus location tracking.
* To notify parents about bus arrival, departure, and trip status.
* To allow school administrators to manage buses, drivers, students, and routes.
* To help drivers update their trip status easily.
* To improve communication between parents and the school transportation system.
* To provide better visibility of daily school bus operations.
* To improve the overall safety and convenience of school transportation.

---

## 3. System Architecture

The application follows a **three-tier architecture** consisting of the frontend, backend, and database.

```text
                    ┌──────────────────────┐
                    │      Users           │
                    │                      │
                    │  Parent | Driver     │
                    │  School Admin        │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │   React Frontend     │
                    │                      │
                    │ Dashboard             │
                    │ Tracking              │
                    │ Notifications         │
                    └──────────┬───────────┘
                               │
                         REST API / JWT
                               │
                               ▼
                    ┌──────────────────────┐
                    │ Java Spring Boot     │
                    │      Backend         │
                    │                      │
                    │ Authentication       │
                    │ Bus Management        │
                    │ Trip Management       │
                    │ Route Management      │
                    │ Notification Service  │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │      MySQL           │
                    │      Database        │
                    │                      │
                    │ Users                 │
                    │ Students              │
                    │ Buses                 │
                    │ Drivers               │
                    │ Routes                │
                    │ Bus Stops             │
                    │ Trips                 │
                    │ Notifications         │
                    └──────────────────────┘
```

### Technology Stack

* **Frontend:** React.js
* **Backend:** Java Spring Boot
* **Database:** MySQL
* **Authentication:** JWT
* **API:** REST API
* **Version Control:** Git & GitHub

---

## 4. Project Modules

### Module 1 — User Authentication

* User registration and login.
* JWT-based authentication.
* Role-based access for Parent, Driver, and School Admin.
* Secure password storage.

### Module 2 — Parent Module

Parents can:

* Login to the application.
* View their child's assigned bus.
* View bus location and trip status.
* View assigned pickup/drop-off stop.
* Receive important bus notifications.
* View previous trip information.

### Module 3 — Driver Module

Drivers can:

* Login to the application.
* View their assigned bus and route.
* Start and end a bus trip.
* Update trip status.
* Share the bus's current location.
* View assigned bus stops.

### Module 4 — School Admin Module

School administrators can:

* Manage students.
* Manage parents.
* Manage drivers.
* Manage buses.
* Create and manage routes.
* Manage bus stops.
* Assign students and drivers to buses.
* Monitor active trips.

### Module 5 — Bus Tracking Module

This module provides:

* Current bus location.
* Bus movement during an active trip.
* Route and stop information.
* Trip status.
* Location updates from the driver's device.

### Module 6 — Notification Module

The notification system provides alerts for important events such as:

* Bus trip started.
* Bus approaching pickup stop.
* Bus reached pickup stop.
* Bus reached school.
* Trip completed.
* Important route or trip updates.

---

## 5. User Flow

### Parent Flow

```text
Parent Login
     ↓
Parent Dashboard
     ↓
View Child Details
     ↓
View Assigned Bus
     ↓
Track Bus Location
     ↓
Receive Bus Notifications
     ↓
View Trip Status / History
```

### Driver Flow

```text
Driver Login
     ↓
Driver Dashboard
     ↓
View Assigned Bus & Route
     ↓
Start Trip
     ↓
Share Current Location
     ↓
Update Trip Status
     ↓
Complete Trip
```

### School Admin Flow

```text
Admin Login
     ↓
Admin Dashboard
     ↓
Manage Students
     ↓
Manage Parents
     ↓
Manage Drivers
     ↓
Manage Buses
     ↓
Manage Routes & Stops
     ↓
Assign Bus / Driver / Route
     ↓
Monitor Active Trips
```

---

## Project Goal

The goal of this project is to create a **centralized and user-friendly school transportation platform** that connects parents, drivers, and school administrators through real-time bus tracking and timely notifications.

The system is designed to make school transportation **more transparent, convenient, and manageable** for all users.
# -School-bus-Tracking-App
A real-time school bus tracking and parent notification system for safety
