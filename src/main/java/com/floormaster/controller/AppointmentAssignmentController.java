package com.floormaster.controller;

import com.floormaster.entities.AppointmentAssignment;
import com.floormaster.service.AppointmentAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/assignments")
public class AppointmentAssignmentController {

    @Autowired
    private AppointmentAssignmentService service;

    @GetMapping
    public List<AppointmentAssignment> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<AppointmentAssignment> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AppointmentAssignment create(@RequestBody AppointmentAssignment assignment) {
        return service.save(assignment);
    }

    @PutMapping("/{id}")
    public AppointmentAssignment update(@PathVariable Long id, @RequestBody AppointmentAssignment assignment) {
        assignment.setAssignmentId(id);
        return service.save(assignment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

