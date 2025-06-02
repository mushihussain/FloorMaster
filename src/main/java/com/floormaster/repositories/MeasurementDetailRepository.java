package com.floormaster.repositories;

import com.floormaster.entities.MeasurementDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementDetailRepository extends JpaRepository<MeasurementDetail, Long> {
}

