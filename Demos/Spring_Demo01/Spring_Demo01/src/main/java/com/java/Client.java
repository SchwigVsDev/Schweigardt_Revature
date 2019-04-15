package com.java;

import com.java.controller.Employee;
import com.java.controller.MyController;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {
    public static void main(String[] args) {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        Employee controller = container.getBean("empl", Employee.class);
        System.out.println(controller);
    }
}
