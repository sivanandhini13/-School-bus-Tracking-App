
package com.example.school_bus_backend;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @GetMapping("/{parentId}")
    public Map<String, Object> getNotification(
            @PathVariable Long parentId) {

        Map<String, Object> notification = new HashMap<>();

        notification.put("parentId", parentId);
        notification.put("title", "School Bus Update");
        notification.put("message",
                "Your child's bus is on the way.");
        notification.put("status", "Demo notification");

        return notification;
    }
}
