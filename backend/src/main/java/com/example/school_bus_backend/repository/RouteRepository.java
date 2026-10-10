
package com.example.school_bus_backend.repository;

import com.example.school_bus_backend.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
