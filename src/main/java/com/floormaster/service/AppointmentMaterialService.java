package com.floormaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floormaster.entities.AppointmentMaterial;
import com.floormaster.repositories.AppointmentMaterialRepository;

@Service
public class AppointmentMaterialService {
	@Autowired
    private AppointmentMaterialRepository repository;

    public List<AppointmentMaterial> getAll() {
        return repository.findAll();
    }

    public Optional<AppointmentMaterial> getById(Long id) {
        return repository.findById(id);
    }

    public AppointmentMaterial save(AppointmentMaterial appointment) {
        return repository.save(appointment);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
