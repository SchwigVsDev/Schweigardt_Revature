package com.java;

public class Simple {
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
    }

    public String toString() {
        return "Simple {Id: " + this.id + " Name: " + this.name + " }";
    }
}