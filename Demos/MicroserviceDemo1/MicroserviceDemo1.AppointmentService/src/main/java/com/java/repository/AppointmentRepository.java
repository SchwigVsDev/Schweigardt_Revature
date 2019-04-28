package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.dto.Appointment;
//appointment: 
//angular code

public interface AppointmentRepository 
extends JpaRepository<Appointment, Integer>
{

}
