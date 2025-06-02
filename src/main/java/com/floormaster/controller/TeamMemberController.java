package com.floormaster.controller;

import com.floormaster.entities.TeamMember;
import com.floormaster.service.TeamMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teammembers")
public class TeamMemberController {

    @Autowired
    private TeamMemberService service;

    @GetMapping
    public List<TeamMember> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<TeamMember> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public TeamMember create(@RequestBody TeamMember member) {
        return service.save(member);
    }

    @PutMapping("/{id}")
    public TeamMember update(@PathVariable Long id, @RequestBody TeamMember member) {
        member.setTeamMemberId(id);
        return service.save(member);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

