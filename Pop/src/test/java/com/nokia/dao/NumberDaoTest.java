package com.nokia.dao;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

class NumberDaoTest {
	
	@InjectMocks
	NumberDao dao;

	@Test
	void removeTest() {
		dao.remove(Mockito.anyInt());
		
	}

}
