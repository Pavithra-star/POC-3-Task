package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.module.Person;

import com.example.service.PersonService;
@RestController
@RequestMapping("/api")
public class PersonController {

@Autowired
private PersonService personservice;

@PostMapping("/create")
public Person create(@RequestBody Person person) {
	return personservice.createperson(person);
	
}

}
