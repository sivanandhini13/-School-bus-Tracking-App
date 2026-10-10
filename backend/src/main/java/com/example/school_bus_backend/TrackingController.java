
package com.example.school_bus_backend;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/tracking")
public class TrackingController {

    @GetMapping("/{busId}")
    public Map<String, Object> getBusLocation(
            @PathVariable Long busId) {

        Map<String, Object> location = new HashMap<>();

        location.put("busId", busId);
        location.put("latitude", 10.7905);
        location.put("longitude", 78.7047);
        location.put("status", "On the way");
        location.put("message", "Demo location - simulated GPS");

        return location;
    }
}
