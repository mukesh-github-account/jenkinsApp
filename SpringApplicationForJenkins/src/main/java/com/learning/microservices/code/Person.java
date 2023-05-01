package com.learning.microservices.code;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Person {

	private int id;
	private String name;
	private int age;

}
