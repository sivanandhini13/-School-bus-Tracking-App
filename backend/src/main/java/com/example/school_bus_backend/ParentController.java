
package com.example.school_bus_backend;

import com.example.school_bus_backend.entity.Parent;
import com.example.school_bus_backend.repository.ParentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/parents")
public class ParentController {

    private final ParentRepository parentRepository;

    public ParentController(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @GetMapping
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    @PostMapping
    public Parent addParent(@RequestBody Parent parent) {
        return parentRepository.save(parent);
    }

    @PutMapping("/{id}")
    public Parent updateParent(@PathVariable Long id, @RequestBody Parent parent) {
        parent.setParentId(id);
        return parentRepository.save(parent);
    }

    @DeleteMapping("/{id}")
    public void deleteParent(@PathVariable Long id) {
        parentRepository.deleteById(id);
    }
}
