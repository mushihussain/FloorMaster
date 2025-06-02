package com.floormaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floormaster.entities.Material;
import com.floormaster.repositories.MaterialRepository;
@Service
public class MaterialService {
	 @Autowired
	    private MaterialRepository repository;

	    public List<Material> getAll() {
	        return repository.findAll();
	    }

	    public Optional<Material> getById(Long id) {
	        return repository.findById(id);
	    }

	    public Material save(Material material) {
	        return repository.save(material);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
}
