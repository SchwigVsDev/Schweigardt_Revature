package com.java.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.java.dto.Doctor;

public interface DoctorRepository extends 
PagingAndSortingRepository<Doctor, Integer> {

}
