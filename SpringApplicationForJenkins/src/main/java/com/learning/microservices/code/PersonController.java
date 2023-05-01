package com.learning.microservices.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@PostMapping("/")
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

	@GetMapping("/")
	public List<Person> getAll() {
		return service.getAll();
	}
}
