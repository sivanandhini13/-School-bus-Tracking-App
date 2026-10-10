
package com.example.school_bus_backend.repository;

import com.example.school_bus_backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
