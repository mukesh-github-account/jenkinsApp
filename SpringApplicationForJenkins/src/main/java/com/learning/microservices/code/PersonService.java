package com.learning.microservices.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepo repo;

	List<Person> getAll() {
		return repo.findAll();
	}

	Person savePerson(Person person) {
		System.out.println(person);
		return repo.save(person);
	}

}
