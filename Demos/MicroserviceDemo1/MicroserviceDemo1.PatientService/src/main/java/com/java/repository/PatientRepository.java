package com.java.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.dto.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
