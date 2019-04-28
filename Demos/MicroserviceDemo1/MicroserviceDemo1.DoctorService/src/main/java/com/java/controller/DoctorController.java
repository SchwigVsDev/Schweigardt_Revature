package com.java.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.dto.ErrorMsg;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/doctors/{id}/appointments")
public class DoctorController {

	@Autowired RestTemplate template;
	
	@GetMapping
	@HystrixCommand(defaultFallback="fallback_getAppointments")
	public String getAppointments() throws URISyntaxException {
		HttpHeaders headers= new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//If appointment is not working
		//If ur appointment service url changes
		RequestEntity requestEntity= new RequestEntity<>(headers, HttpMethod.GET, new URI("http://localhost:9004/appointments"));
		ResponseEntity<String> response=template.exchange(requestEntity,String.class);
		System.out.println(response.getBody());
		return response.getBody();
	}
	//spring-caching: ehcache
	public String fallback_getAppointments() throws JsonProcessingException
	{
		ErrorMsg obj=new ErrorMsg(500, "Service not respoding, try again later");
		ObjectMapper mapper= new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}
}
