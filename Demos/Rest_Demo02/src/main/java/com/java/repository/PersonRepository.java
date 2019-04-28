package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.java.dto.Address;
import com.java.dto.Person;

@Transactional(readOnly = false)
public interface PersonRepository extends JpaRepository<Person, Integer> {
	public Person getAddressByPid(int pid);
}
