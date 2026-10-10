CREATE DATABASE IF NOT EXISTS school_bus_db;
USE school_bus_db;

CREATE TABLE IF NOT EXISTS user (
    user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS parent (
    parent_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    phone VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES user(user_id)
);

CREATE TABLE IF NOT EXISTS driver (
    driver_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    phone VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES user(user_id)
);

CREATE TABLE IF NOT EXISTS route (
    route_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    route_name VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS bus (
    bus_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    bus_number VARCHAR(50) NOT NULL,
    driver_id BIGINT,
    route_id BIGINT,
    FOREIGN KEY (driver_id) REFERENCES driver(driver_id),
    FOREIGN KEY (route_id) REFERENCES route(route_id)
);

CREATE TABLE IF NOT EXISTS student (
    student_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT,
    parent_id BIGINT,
    bus_id BIGINT,
    FOREIGN KEY (parent_id) REFERENCES parent(parent_id),
    FOREIGN KEY (bus_id) REFERENCES bus(bus_id)
);

CREATE TABLE IF NOT EXISTS bus_stop (
    stop_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    stop_name VARCHAR(100) NOT NULL,
    latitude DECIMAL(10,7),
    longitude DECIMAL(10,7),
    route_id BIGINT,
    FOREIGN KEY (route_id) REFERENCES route(route_id)
);

CREATE TABLE IF NOT EXISTS trip (
    trip_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    bus_id BIGINT NOT NULL,
    route_id BIGINT NOT NULL,
    start_time DATETIME,
    end_time DATETIME,
    status VARCHAR(30),
    FOREIGN KEY (bus_id) REFERENCES bus(bus_id),
    FOREIGN KEY (route_id) REFERENCES route(route_id)
);

CREATE TABLE IF NOT EXISTS bus_location (
    location_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    bus_id BIGINT NOT NULL,
    latitude DECIMAL(10,7) NOT NULL,
    longitude DECIMAL(10,7) NOT NULL,
    timestamp DATETIME NOT NULL,
    FOREIGN KEY (bus_id) REFERENCES bus(bus_id)
);

CREATE TABLE IF NOT EXISTS notification (
    notification_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    message VARCHAR(500) NOT NULL,
    status VARCHAR(30),
    timestamp DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(user_id)
);
