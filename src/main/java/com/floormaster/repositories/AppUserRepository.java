package com.floormaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floormaster.entities.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}

    


