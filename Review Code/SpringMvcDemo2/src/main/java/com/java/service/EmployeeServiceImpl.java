package com.java.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dto.Employee;
import com.java.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired EmployeeRepository rep;
	@Override
	public List<Employee> getEmployees() {
		return rep.getEmployees();
	}
/*
	@Override
	public Employee getEmployeeById(int id) {
		return rep.getEmployeeById(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		rep.updateEmployee(e);
		
	}

	@Override
	public void deleteEmployee(int id) {
		rep.deleteEmployee(id);
		
	}*/

	@Override
	public void insertEmployee(Employee e) {
		rep.insertEmployee(e);
	}

	/*public static boolean transactionActive() {
	      try {
	          ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
	          Class tsmClass = contextClassLoader.loadClass("org.springframework.transaction.support.TransactionSynchronizationManager");
	          Boolean isActive = (Boolean) tsmClass.getMethod("isActualTransactionActive", null).invoke(null, null);
	          
	          System.out.println( tsmClass.getMethod("isActualTransactionActive", null).invoke(null, null));
	          return isActive;
	      } catch (ClassNotFoundException e) {
	          e.printStackTrace();
	      } catch (IllegalArgumentException e) {
	          e.printStackTrace();
	      } catch (SecurityException e) {
	          e.printStackTrace();
	      } catch (IllegalAccessException e) {
	          e.printStackTrace();
	      } catch (InvocationTargetException e) {
	          e.printStackTrace();
	      } catch (NoSuchMethodException e) {
	          e.printStackTrace();
	      }
	      return false;
	}*/
}
