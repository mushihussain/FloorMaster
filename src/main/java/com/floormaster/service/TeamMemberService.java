package com.floormaster.service;


import com.floormaster.entities.TeamMember;
import com.floormaster.repositories.TeamMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamMemberService {

    @Autowired
    private TeamMemberRepository repository;

    public List<TeamMember> getAll() {
        return repository.findAll();
    }

    public Optional<TeamMember> getById(Long id) {
        return repository.findById(id);
    }

    public TeamMember save(TeamMember member) {
        return repository.save(member);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

