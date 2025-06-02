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

import com.floormaster.entities.Material;
import com.floormaster.service.MaterialService;

@RestController
@RequestMapping("/api/material")
public class MaterialController {
	 @Autowired
	    private MaterialService service;

	    @GetMapping
	    public List<Material> getAll() {
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<Material> getById(@PathVariable Long id) {
	        return service.getById(id);
	    }

	    @PostMapping
	    public Material create(@RequestBody Material member) {
	        return service.save(member);
	    }

	    @PutMapping("/{id}")
	    public Material update(@PathVariable Long id, @RequestBody Material member) {
	        member.setMaterialId(id);
	        return service.save(member);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
}
