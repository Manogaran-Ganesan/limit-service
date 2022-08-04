package com.in28mints.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public LimitsBean getValue() {

		return new LimitsBean(configuration.getMinimum(), configuration.getMaximum());

	}
}
