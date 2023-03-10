package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
