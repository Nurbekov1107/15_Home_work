package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(getName() + "is singing");
    }

    public void playGuitar() {
        System.out.println(getName() + "is playing a guitar");
    }

    @Override
    public String toString() {
        return "Band Name = " + bandName + "\n" + super.toString();
    }
}