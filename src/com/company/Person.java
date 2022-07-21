package com.company;

public class Person {
    private String name;
    private String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " is learning");
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Person's name is " + name + '\n' +
                "His designation is " + designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}