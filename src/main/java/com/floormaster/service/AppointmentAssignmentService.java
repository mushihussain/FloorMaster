package com.floormaster.service;

import com.floormaster.entities.AppointmentAssignment;
import com.floormaster.repositories.AppointmentAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentAssignmentService {

    @Autowired
    private AppointmentAssignmentRepository repository;

    public List<AppointmentAssignment> getAll() {
        return repository.findAll();
    }

    public Optional<AppointmentAssignment> getById(Long id) {
        return repository.findById(id);
    }

    public AppointmentAssignment save(AppointmentAssignment assignment) {
        return repository.save(assignment);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

