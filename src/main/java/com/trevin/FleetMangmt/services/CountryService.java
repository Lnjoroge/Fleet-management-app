package com.trevin.FleetMangmt.services;

import java.util.List;
import java.util.Optional;

import com.trevin.FleetMangmt.models.Country;
import com.trevin.FleetMangmt.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Get All Countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}


//	save new country
	public void save(Country country){
		countryRepository.save(country);
	}

	//get by id
	public Optional<Country> findById(int id){
		return countryRepository.findById(id);
	}

}
