
package com.example.school_bus_backend.repository;

import com.example.school_bus_backend.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByParentId(Long parentId);
}
