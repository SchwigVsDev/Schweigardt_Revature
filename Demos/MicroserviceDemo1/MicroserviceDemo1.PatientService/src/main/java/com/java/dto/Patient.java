package com.java.dto;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue
	int id;
	String name;
	String address;
	long phoneNumber;
	@ElementCollection
	//doctor id is the value
	Map<HealthInfo, Integer> pastHistory;
	//File report;
}
