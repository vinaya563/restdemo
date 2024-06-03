package com.example.demo.objects;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Person {

	private String name;
	private String id;
	private HashMap<String , Integer> marks;

	
	public Person() {
		super();
	}
	
	public Person(String name, String id, HashMap<String , Integer> marks) {
		this.name = name;
		this.id=id;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HashMap<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, Integer> marks) {
		this.marks = marks;
	}
}
