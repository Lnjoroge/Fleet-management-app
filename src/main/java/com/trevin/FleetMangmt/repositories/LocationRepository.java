package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
