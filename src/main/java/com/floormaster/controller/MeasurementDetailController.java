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

import com.floormaster.entities.MeasurementDetail;
import com.floormaster.service.MeasurementDetailService;

@RestController
@RequestMapping("/api/measurmentdetail")
public class MeasurementDetailController {
	  @Autowired
	    private MeasurementDetailService service;

	    @GetMapping
	    public List<MeasurementDetail> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<MeasurementDetail> getById(@PathVariable Long id) {
	        return service.getById(id);
	    }

	    @PostMapping
	    public MeasurementDetail create(@RequestBody MeasurementDetail member) {
	        return service.save(member);
	    }

	    @PutMapping("/{id}")
	    public MeasurementDetail update(@PathVariable Long id, @RequestBody MeasurementDetail member) {
	        member.setMeasurementId(id);
	        return service.save(member);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
}
