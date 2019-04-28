package com.java.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class HealthInfo {

	@Id
	@GeneratedValue
	int id;
	String disease;
	String description;
	LocalDate timeOfDisease;
	@ElementCollection
	List<String> medicines;
	
}
