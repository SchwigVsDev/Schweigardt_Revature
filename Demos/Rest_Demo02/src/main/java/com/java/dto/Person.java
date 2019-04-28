package com.java.dto;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class Person {
	@Id
	int id;
	String name;
	@ElementCollection
	List<Long> phoneNumber;
	@OneToOne
	Address address;
	/*
	 * public static void main(String[] args) { Person p=
	 * Person.builder().id(123).name("Payal").build(); }
	 */
}
