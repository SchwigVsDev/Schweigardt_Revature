package com.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Simple implements InitializingBean, DisposableBean {
    int id;
    String name;

    // #region Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // #endregion

    Simple(int id) {
        this.id = id;
        System.out.println("Constructor. \n-----");
    }

    public String toString() {
        return "Simple {Id: " + this.id + " Name: " + this.name + " }";
    }

    public void init() {
        System.out.println("Default init method \n-----");
    }

    public void enit() {
        System.out.println("Non-default init method. \n-----");
    }

    public void destroy() {
        System.out.println("Default destroy method \n-----");
    }

    public void deestroy() {
        System.out.println("Non-default destroy method. \n-----");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties Set. \n-----");
    }
}