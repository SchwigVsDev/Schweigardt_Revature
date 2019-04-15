package com.java.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    private List<String> projects = new ArrayList<>();
    private int[] managerIds;
    private Map<Integer, Integer> progress = new HashMap<>();
    private Address address;

    // #region Getters/Setter
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the projects
     */
    public List<String> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    /**
     * @return the managerIds
     */
    public int[] getManagerIds() {
        return managerIds;
    }

    /**
     * @param managerIds the managerIds to set
     */
    public void setManagerIds(int[] managerIds) {
        this.managerIds = managerIds;
    }

    /**
     * @return the progress
     */
    public Map<Integer, Integer> getProgress() {
        return progress;
    }

    /**
     * @param progress the progress to set
     */
    public void setProgress(Map<Integer, Integer> progress) {
        this.progress = progress;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    // #endregion

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: {ID: " + this.id + " Name: " + this.name + "Address: " + this.address + "}";
    }
}

class Address {
    int hNo;
    String city, street;
    int pincode;

    // #region Getters/Setter
    /**
     * @return the hNo
     */
    public int gethNo() {
        return hNo;
    }

    /**
     * @param hNo the hNo to set
     */
    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the pincode
     */
    public int getPincode() {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    // #endregion

    @Override
    public String toString() {
        return "Address - " + this.hNo + " " + this.street + " " + this.city + " " + this.pincode;
    }
}