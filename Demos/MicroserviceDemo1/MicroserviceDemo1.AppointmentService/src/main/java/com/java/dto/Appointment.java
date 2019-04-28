package com.java.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.Future;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Appointment {
@EmbeddedId
	Aid id;
	int patientId;
}

@Embeddable
@Data
class Aid implements Serializable{
	int doctorId;
	@Future
	LocalDateTime dateTime;
}
