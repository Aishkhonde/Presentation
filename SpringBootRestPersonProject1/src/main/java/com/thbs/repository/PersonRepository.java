package com.thbs.repository;

import java.util.ArrayList;
import java.util.List;

import com.thbs.model.Person;

public class PersonRepository {
	List<Person> plist;
	
	public PersonRepository()
	{
		plist=new ArrayList<Person>();
		Person p1=new Person();
		p1.setPersonId(1);
		p1.setPersonName("Aishwarya");
		p1.setPersonSalary(30000);
		
		Person p2=new Person();
		p2.setPersonId(2);
		p2.setPersonName("Divya");
		p2.setPersonSalary(30000);
		
		plist.add(p1);
		plist.add(p2);
		
	}
	public List<Person> getAllPersons()
	{
		return plist;
	}
	

}
