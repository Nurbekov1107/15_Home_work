package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(getName() + " is dancing");
    }

    @Override
    public String toString() {
        return "Group Name = " + groupName + "\n" + super.toString();
    }
}