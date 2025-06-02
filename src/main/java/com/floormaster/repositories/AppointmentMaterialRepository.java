package com.floormaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floormaster.entities.AppointmentMaterial;

@Repository
public interface AppointmentMaterialRepository extends JpaRepository<AppointmentMaterial, Long> {
}

