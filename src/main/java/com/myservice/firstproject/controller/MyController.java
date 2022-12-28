package com.myservice.firstproject.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class MyController {

	// we need to make this method as an endpoint...
	@GetMapping("/paymentDate")
	public Date getDate() {
		return new Date();
	}
	
	//
	@GetMapping("/getCustomerName")
	public String getName() {
		return "Hi My name is Swapnil baba";
	}
	
	@PostMapping("/calculateLength")
	public String calculateLength(@RequestBody String name) {
		return "hello "+name;
	}
	
	
	
	
	
	
	
	
	
}
