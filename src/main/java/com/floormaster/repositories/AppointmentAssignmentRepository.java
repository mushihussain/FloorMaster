package com.floormaster.repositories;

import com.floormaster.entities.AppointmentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentAssignmentRepository extends JpaRepository<AppointmentAssignment, Long> {
}

