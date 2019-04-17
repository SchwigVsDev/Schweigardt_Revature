package com.java;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config2.xml");
        Simple smpl = ctx.getBean("simple", Simple.class);
       // System.out.println(smpl);

        ((ConfigurableApplicationContext) ctx).close();
    }
}