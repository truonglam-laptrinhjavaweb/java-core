package com.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.repository.ICustomerRepository;
import com.laptrinhjavaweb.utils.HibernateUtils;

public class CustomerRepository implements ICustomerRepository {

	@Override
	public List<CustomerEntity> findAll() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		String sql = "FROM CustomerEntity";
		Query<CustomerEntity> query = session.createQuery(sql, CustomerEntity.class);
		return query.getResultList();
	}

}
