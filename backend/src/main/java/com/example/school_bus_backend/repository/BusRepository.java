
package com.example.school_bus_backend.repository;

import com.example.school_bus_backend.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
