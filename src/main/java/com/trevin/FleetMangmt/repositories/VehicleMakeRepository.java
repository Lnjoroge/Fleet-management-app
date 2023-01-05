package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
