package com.company.professions;

public class Driver extends Person {
    int experience;

    public Driver() {

    }

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return super.toString()+"\nВодительский стаж: " + this.experience + " лет";
    }
}
