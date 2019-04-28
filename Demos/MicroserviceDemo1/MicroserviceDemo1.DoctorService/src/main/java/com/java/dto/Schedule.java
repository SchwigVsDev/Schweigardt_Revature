package com.java.dto;

import java.time.LocalTime;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
public class Schedule {

	private LocalTime startTime, endTime;
}
