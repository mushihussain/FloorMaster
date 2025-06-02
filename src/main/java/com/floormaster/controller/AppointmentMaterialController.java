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

import com.floormaster.entities.AppointmentMaterial;
import com.floormaster.service.AppointmentMaterialService;

@RestController
@RequestMapping("/api/appointmentMaterial")
public class AppointmentMaterialController {
	 @Autowired
	    private AppointmentMaterialService service;

	    @GetMapping
	    public List<AppointmentMaterial> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<AppointmentMaterial> getById(@PathVariable Long id) {
	        return service.getById(id);
	    }

	    @PostMapping
	    public AppointmentMaterial create(@RequestBody AppointmentMaterial appointment) {
	        return service.save(appointment);
	    }

	    @PutMapping("/{id}")
	    public AppointmentMaterial update(@PathVariable Long id, @RequestBody AppointmentMaterial appointmentMaterial) {
	    	appointmentMaterial.setId(id);
	        return service.save(appointmentMaterial);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
}
