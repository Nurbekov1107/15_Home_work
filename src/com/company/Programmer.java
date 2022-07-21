package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println(getName() + " is coding");
    }


    @Override
    public String toString() {
        return "Company name = " + companyName + "\n" + super.toString();
    }

}