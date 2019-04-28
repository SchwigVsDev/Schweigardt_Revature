package com.java.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.java.dto.Person;

@Component
@Transactional(readOnly=false)
public class DataInitializer implements CommandLineRunner{

	@Autowired PersonRepository rep;
	@Override
	public void run(String... args) throws Exception {

		rep.save(Person.builder().id(123).name("Payal").build());
		//rep.save(Person.builder().id(121).name("Ritu").address("701 W nedderman").build());
	}

}
