package com.java.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.java.dto.Person;
import com.java.repository.PersonRepository;

@Controller
@RequestMapping("/people")
public class PersonController {

	@Autowired
	PersonRepository rep;

	// Content Negotiation, Representational state transfer
	// Get
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public List<Person> getPeopleInfo() {
		return rep.findAll(); // jackson-databind: convert to json
	}

	// Get by Id
	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Person> getPersonById(@PathVariable int id) {
		if (rep.findById(id).get() == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.ok(rep.findById(id).get());
		}
	}

	// Post
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Person> insertPerson(@RequestBody Person person, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.header("location", request.getRequestURI() + "/" + rep.save(person).getId()).build();
	}

	// Put
	@PutMapping(path = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseStatus(code = HttpStatus.NO_CONTENT, reason = "Successfully Updated")
	public void updatePerson(@PathVariable int id, @RequestBody Person person) {
		person.setId(id);
		rep.save(person);
	}

	// Delete
	@PutMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT, reason = "Successfully Deleted")
	public void deletePerson(@PathVariable int id, @RequestBody Person person) {
		rep.delete(person);
	}

}
