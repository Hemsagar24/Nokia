package com.nokia.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nokia.dao.NumberDao;


@RestController
@SpringBootApplication
@ComponentScan("com.nokia.dao")
@EntityScan( value = {"com.nokia.entity"} )
public class TestApplication {
	
	@Autowired
	NumberDao dao;
	
	@Autowired
	Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@PostMapping("/pop")
	public String pop() {
		System.out.println(env.getProperty("spring.profiles.active"));
		try {
			if(dao.getRecordCount()==0) {
				return "No Record found to be popped";
			}
			Integer lastNum = dao.getLastRecord();
			return lastNum.toString();
		}catch (Exception e) {
			return e.getMessage();
		}
	}
	

}
