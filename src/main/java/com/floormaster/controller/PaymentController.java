package com.floormaster.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floormaster.entities.Payment;
import com.floormaster.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	  @Autowired
	    private PaymentService service;

	    @GetMapping
	    public List<Payment> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<Payment> getById(@PathVariable Long id) {
	        return service.getById(id);
	    }

	    @PostMapping
	    public Payment create(@RequestBody Payment member) {
	        return service.save(member);
	    }

	    @PutMapping("/{id}")
	    public Payment update(@PathVariable Long id, @RequestBody Payment member) {
	        member.setPaymentId(id);
	        return service.save(member);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
}
