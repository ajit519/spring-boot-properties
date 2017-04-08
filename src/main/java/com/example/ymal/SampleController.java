package com.example.ymal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	ConfigDetails configDetails;
	
	@Autowired
	AppConfig appConfig;
	
	@Autowired
	PersistenceConfig persistenceConfig;
	
	@Autowired
	Martin marin;
	
	
	
	@RequestMapping("/hello")
	public String sayHello(){
		System.out.println(appConfig.getName());
		
		System.out.println(configDetails.getMachine());
		
		System.out.println(persistenceConfig.getDialect());
		
		System.out.println(marin.getName());
		return "Hello";
	}
}
