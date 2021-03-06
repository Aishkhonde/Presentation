package com.thbs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.model.Person;

import com.thbs.repository.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@GetMapping("/getAllPersons")
	public ResponseEntity<List<Person>>getAllBooksDetails(){
		PersonRepository br=new PersonRepository();
		List<Person>blist=br.getAllPersons();
		return new ResponseEntity<List<Person>>(blist,HttpStatus.OK);
		
	}
	

}
