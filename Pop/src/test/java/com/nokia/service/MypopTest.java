package com.nokia.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.env.Environment;

import com.nokia.dao.NumberDao;

@ExtendWith(MockitoExtension.class)
class MypopTest {

	@InjectMocks
	Mypop pop;

	@Mock
	NumberDao dao;

	@Mock
	Environment env;

	@Test
	/** 0 count */
	void test1() {
		pop.pop();
	}

	@Test
	/** greater then 0 count */
	void test2() {
		Mockito.when(dao.getRecordCount()).thenReturn(2);
		pop.pop();
	}

}
