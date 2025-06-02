package com.floormaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floormaster.entities.MeasurementDetail;
import com.floormaster.repositories.MeasurementDetailRepository;

@Service
public class MeasurementDetailService {

    @Autowired
    private MeasurementDetailRepository repository;

    public List<MeasurementDetail> getAll() {
        return repository.findAll();
    }

    public Optional<MeasurementDetail> getById(Long id) {
        return repository.findById(id);
    }

    public MeasurementDetail save(MeasurementDetail measurementDetail) {
        return repository.save(measurementDetail);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

