package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config2.xml");
        Simple smpl = ctx.getBean("simple", Simple.class);
        Simple smpl2 = ctx.getBean("simple", Simple.class);
        Simple smpl3 = ctx.getBean("simple2", Simple.class);
        System.out.println(smpl);
        System.out.println(smpl2);
        System.out.println(smpl3);
        System.out.println(smpl == smpl2);
        System.out.println(smpl2 == smpl3);

        ((ConfigurableApplicationContext) ctx).close();
    }
}