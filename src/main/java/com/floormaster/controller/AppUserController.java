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

import com.floormaster.entities.AppUser;
import com.floormaster.service.AppUserService;

@RestController
@RequestMapping("/api/appUser")
public class AppUserController {
	@Autowired
    private AppUserService service;

    @GetMapping
    public List<AppUser> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<AppUser> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AppUser create(@RequestBody AppUser member) {
        return service.save(member);
    }

    @PutMapping("/{id}")
    public AppUser update(@PathVariable Long id, @RequestBody AppUser member) {
        member.setUserId(id);
        return service.save(member);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
