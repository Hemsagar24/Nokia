package com.nokia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nokia.dao.NumberDao;
import com.nokia.entity.MyNumber;


@RestController
public class MyPush {

	@Autowired
	NumberDao dao;

	@GetMapping("/push")
	/** Considering all type of inputs */
	public String push(@RequestParam Object input) {

		try {
			if (input == null || input == "") {
				return "Please insert a valid number";
			}
			String inputStr = input.toString().trim();
			/** Checking if input is parsable to number or not else through exception */
			int number = Integer.parseInt(inputStr);
			MyNumber myNum = new MyNumber();
			myNum.setSerilNo(number);
			/** Inserting to DB */
			dao.insert(myNum);
			return "Number inserted to DB: " + number;
		} catch (Exception e) {
			return "Please Enter a valid number \n" + e.getMessage();
		}
	}

}
