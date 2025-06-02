package com.floormaster.service;

import com.floormaster.entities.Appointment;
import com.floormaster.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public List<Appointment> getAll() {
        return repository.findAll();
    }

    public Optional<Appointment> getById(Long id) {
        return repository.findById(id);
    }

    public Appointment save(Appointment appointment) {
        return repository.save(appointment);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

