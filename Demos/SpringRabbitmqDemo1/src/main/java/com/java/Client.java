package com.java;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Client {

	@Bean public Queue queue1() {
		return new Queue("queue-1");
	}
	public static void main(String[] args) {
			ApplicationContext ctx=SpringApplication.run(Client.class, args);
			MyProducer producer=ctx.getBean(MyProducer.class);
			producer.send("First message");
	}

}
