package com.floormaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floormaster.entities.AppUser;
import com.floormaster.repositories.AppUserRepository;

@Service
public class AppUserService {
	  @Autowired
	    private AppUserRepository repository;

	    public List<AppUser> getAll() {
	        return repository.findAll();
	    }

	    public Optional<AppUser> getById(Long id) {
	        return repository.findById(id);
	    }

	    public AppUser save(AppUser appUser) {
	        return repository.save(appUser);
	    }

	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
}
