package com.nokia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class NumberDao {

	@PersistenceContext
	EntityManager entity;

	public void remove(int max) {
		Query remove = entity.createQuery("delete from MyNumber where id = "+max);
		remove.executeUpdate();
	}

	public Integer getLastRecord() {
		Query maxId = entity.createQuery("select max(id) from MyNumber");
		int max = Integer.parseInt(maxId.getSingleResult().toString());
		
		Query serialNo = entity.createQuery("select serialNo from MyNumber where id = "+max);
		int res = Integer.parseInt(serialNo.getSingleResult().toString());
		remove(max);
		return res;
	}

	public Integer getRecordCount() {
		Query query = entity.createQuery("select count(id) from MyNumber");
		Integer count = Integer.parseInt(query.getSingleResult().toString());
		return count;
	}
}
