package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
