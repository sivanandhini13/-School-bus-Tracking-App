
package com.example.school_bus_backend;

import com.example.school_bus_backend.entity.Route;
import com.example.school_bus_backend.repository.RouteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/routes")
public class RouteController {

    private final RouteRepository routeRepository;

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @GetMapping
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @PostMapping
    public Route addRoute(@RequestBody Route route) {
        return routeRepository.save(route);
    }
}
