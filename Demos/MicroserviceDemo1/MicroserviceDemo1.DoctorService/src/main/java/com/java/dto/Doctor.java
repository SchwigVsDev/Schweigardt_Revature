package com.java.dto;

import java.time.DayOfWeek;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Doctor {
	//@JsonIgnore
	@GeneratedValue
	@Id
	int id;
	String name;
	String address;
	long phoneNumber;
	@ElementCollection
	//TODO: change value to type Schedule
	Map<DayOfWeek, String> schedule;
}
