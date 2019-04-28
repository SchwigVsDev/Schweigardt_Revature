package com.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.Employee;
import com.java.service.EmployeeService;

@Controller
@RequestMapping("/employees.do")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping
	public void getEmployees(HttpServletResponse response) throws IOException {
		List<Employee> list = service.getEmployees();
		response.getWriter().println(list);
	}

	@GetMapping("/form.do")
	public String getEmployeePage() {
		return "form";
	}

	@PostMapping
	public void addEmployee(@Valid @ModelAttribute Employee employee, HttpServletResponse response) throws IOException {
		service.insertEmployee(employee);
		response.getWriter().println("Inserted successfully");
	}


}
