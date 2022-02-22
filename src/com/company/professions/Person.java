package com.company.professions;

public class Person {
    String fullName;
    int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void talk() {
        System.out.print(fullName + " говорит: ");
    }

    public void move() {
        System.out.println("мне " + age + " лет");
    }

    @Override
    public String toString() {
        return "\nФИО: " + this.fullName + "\nВозраст: " + this.age + " лет";
    }
}

