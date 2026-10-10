
package com.example.school_bus_backend.repository;

import com.example.school_bus_backend.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}

