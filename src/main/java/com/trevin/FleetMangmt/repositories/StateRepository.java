package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
