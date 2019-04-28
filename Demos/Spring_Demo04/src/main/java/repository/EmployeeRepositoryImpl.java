package repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	SessionFactory sf;

	@Override
	public List<Employee> getEmployees() {
		Session s = sf.openSession();
		Query q = s.createQuery("From Employee E");
		List<Employee> e = q.list();
		return e;
	}

	@Override
	public void deleteEmployee(int id) {
		Session s = sf.openSession();
		Query q = s.createQuery("Delete From Employee E where E.id = :id");
		int r = q.setParameter("id", id).executeUpdate();
		s.close();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session s = sf.openSession();
		Query q = s.createQuery("From Employee E where E.id = :id");
		List<Employee> e = q.setParameter("id", id).list();
		s.close();
		return e.get(0);
	}

	@Override
	public void insertEmployee(Employee e) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
	}

	@Override
	public void updateEmployee(Employee e) {

	}

}