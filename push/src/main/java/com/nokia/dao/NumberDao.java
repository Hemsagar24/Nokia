package com.nokia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.nokia.entity.MyNumber;

@Repository
@Transactional
public class NumberDao {
	
	@PersistenceContext
	EntityManager entity;
	
	public void insert(MyNumber num) {
		entity.persist(num);
	}
	

}
