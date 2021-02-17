package com.nokia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nokia.dao.NumberDao;

@RestController
@Component
public class Mypop {

	@Autowired
	NumberDao dao;

	@GetMapping("/pop")
	public String pop() {

		int count = dao.getRecordCount();
		if (count == 0) {
			return "No Record found to be popped";
		}
		Integer lastNum = dao.getLastRecord();
		return lastNum.toString();
	}

}
