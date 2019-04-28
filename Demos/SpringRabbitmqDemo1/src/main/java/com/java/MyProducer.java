package com.java;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyProducer {
	
	@Autowired RabbitTemplate template;
	@Autowired Queue queue;

	public void send(String message) {
		template.convertAndSend(queue.getName(), message);
	}
}
