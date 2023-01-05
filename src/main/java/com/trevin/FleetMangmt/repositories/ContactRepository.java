package com.trevin.FleetMangmt.repositories;

import com.trevin.FleetMangmt.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
