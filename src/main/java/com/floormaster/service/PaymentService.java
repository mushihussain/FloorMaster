package com.floormaster.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floormaster.entities.Payment;
import com.floormaster.repositories.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public List<Payment> getAll() {
        return repository.findAll();
    }

    public Optional<Payment> getById(Long id) {
        return repository.findById(id);
    }

    public Payment save(Payment member) {
        return repository.save(member);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

