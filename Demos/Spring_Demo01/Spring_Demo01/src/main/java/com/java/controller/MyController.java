package com.java.controller;

import com.java.service.MyService;

public class MyController {
    private String id;
    private MyService service;

    public void setId(String id) {
        this.id = id;
    }

    public MyController(MyService service) {
        this.service = service;
    }

    public void methodDemo() {
        System.out.println(id);
        service.m1();
    }
}