package com.nokia.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nokia.dao.NumberDao;

@ExtendWith(MockitoExtension.class)
class MyPushTest {

	@InjectMocks
	MyPush push;

	@Mock
	NumberDao dao;

	@Test
	/** valid input */
	void test1() {
		push.push(1);
	}
	
	@Test
	/** valid input but space at last */
	void test2() {
		push.push("11 ");
	}
	
	@Test
	/** alphabetic characters invalid input */
	void test3() {
		push.push("sa ");
	}
	
	@Test
	/** special characters invalid input */
	void test4() {
		push.push("%(# ");
	}
	
	@Test
	/** null invalid input */
	void test5() {
		push.push(null);
	}
	
	@Test
	/** "" invalid input */
	void test6() {
		push.push("");
	}

}
