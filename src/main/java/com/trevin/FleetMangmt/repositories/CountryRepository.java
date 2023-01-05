package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
