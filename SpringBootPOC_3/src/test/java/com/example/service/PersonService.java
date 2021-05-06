package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonDao;
import com.example.module.Person;

@Service
public class PersonService {
@Autowired
private PersonDao personDao;

public Person createperson(Person person) {
	return personDao.save(person);
	
	
}




}
