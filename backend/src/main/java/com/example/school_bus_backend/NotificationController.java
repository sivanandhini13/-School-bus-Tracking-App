
package com.example.school_bus_backend;

import com.example.school_bus_backend.entity.Notification;
import com.example.school_bus_backend.repository.NotificationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationRepository notificationRepository;

    public NotificationController(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @GetMapping("/{parentId}")
    public List<Notification> getNotifications(@PathVariable Long parentId) {
        return notificationRepository.findByParentId(parentId);
    }

    @PostMapping
    public Notification addNotification(@RequestBody Notification notification) {
        return notificationRepository.save(notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationRepository.deleteById(id);
    }
}
