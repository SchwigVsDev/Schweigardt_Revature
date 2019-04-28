package com.java.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.java.dto.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sf;

	@Override
	public List<Employee> getEmployees() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> list= criteria.list();
		session.close();
		return list;
	}
	/*  TODO to be tested */
	/*
	@Override
	public Employee getEmployeeById(int id) {
		Session s=sf.openSession();
		Employee e=s.get(Employee.class,id);
		s.close();
		return e;
	}

	@Override
	public void updateEmployee(Employee e) {
		Session s=sf.openSession();
		s.beginTransaction();
		s.update(e);
		s.getTransaction().commit();
		s.close();
	}

	@Override
	public void deleteEmployee(int id) {
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(id);
		s.getTransaction().commit();
		s.close();
	}
	*/

	@Override
	public void insertEmployee(Employee e) {
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(e);
		s.getTransaction().commit();
		s.close();
	}

}
