package com.myservice.firstproject.service;

import org.springframework.stereotype.Service;

import com.myservice.firstproject.bean.UserDetails;

@Service
public class RegistrationService {

	public String registerService(UserDetails userDetails) {
		return "user name "+userDetails.getName()+ " is successfully registered with mobile num : "+ userDetails.getMobNum();
	}
}
