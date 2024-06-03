package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;


import com.example.demo.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.objects.Person;

@RestController
public class RestDemoController {
	private final FirebaseService fireBaseService;

	@Autowired
	public RestDemoController(FirebaseService fireBaseService) {
		this.fireBaseService = fireBaseService;
	}
	@GetMapping("/getUserDetails")
	public Person getExample(@RequestHeader() String name) throws InterruptedException, ExecutionException {
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("English", 90);
		scores.put("Hindi", 90);
	return fireBaseService.getUserDetails(name);
	}

	@PostMapping("/createUser")
	public String postExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
	return fireBaseService.saveUserDetails(person);
		//return "name";
	}

	@PutMapping("/updateUser")
	public String putExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
		return fireBaseService.updateUserDetails(person);
	}

	@DeleteMapping("/deleteUser")
	public String deleteExample(@RequestHeader String name) {
		return fireBaseService.deleteUser(name);
	}

}
