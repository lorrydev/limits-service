package com.i28miutes.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.i28miutes.microservices.limitsservice.config.Configuration;
import com.i28miutes.microservices.limitsservice.domain.LimitConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LimitsConfigurationController {
	
	private final Configuration configuration;
	
	
	@Autowired
	public LimitsConfigurationController(Configuration configuration) {
		super();
		this.configuration = configuration;
	}




	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {		
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}
}
