package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
