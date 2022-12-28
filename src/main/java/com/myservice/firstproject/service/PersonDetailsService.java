package com.myservice.firstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myservice.firstproject.entity.PersonDetails;
import com.myservice.firstproject.repository.PersonDetailsRepo;

@Service
public class PersonDetailsService {

	@Autowired
	private PersonDetailsRepo personDetailsRepo;
	
	
	public String savePersonToDB(PersonDetails details) {
		try {
			personDetailsRepo.save(details);
			return "Successfully saved to DB";
		}
		catch(Exception e){
			return "failed to save in DB reason : "+e.getLocalizedMessage();
		}
		
		
	}
	
	public String saveBulkPersonToDB(List<PersonDetails> reqList) {
		
		try {
			personDetailsRepo.saveAll(reqList);
			return "Successfully saved to DB";
		}
		catch(Exception e){
			return "failed to save in DB reason : "+e.getLocalizedMessage();
		}
	}
	
	public PersonDetails getPersonById(String personId) {
		try {
			return personDetailsRepo.findById(personId).get();
		}
		catch(Exception e ) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public List<PersonDetails> getPersonByCity(String city) {
		try {
			return personDetailsRepo.findByCity(city);
		}
		catch(Exception e ) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	public List<PersonDetails> getPersonByCityAndName(String city, String name) {
		try {
			return personDetailsRepo.findByCityAndPersonName(city, name);
		}
		catch(Exception e ) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
}
