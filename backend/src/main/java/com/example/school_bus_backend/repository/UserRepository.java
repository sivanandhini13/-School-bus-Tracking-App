package com.example.school_bus_backend.repository;

import com.example.school_bus_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}