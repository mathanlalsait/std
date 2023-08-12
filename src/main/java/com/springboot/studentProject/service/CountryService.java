package com.springboot.studentProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentProject.model.Country;
import com.springboot.studentProject.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired 
	public CountryRepository countryRepository;
	
	public void saveCountry(Country country) {
		countryRepository.save(country);
		
	}
	
	public List<Country> getAllCountry(){
		return (List<Country>) countryRepository.findAll();
	}
	
	public void deleteAllCountries() {
		countryRepository.deleteAll();
	}
}
