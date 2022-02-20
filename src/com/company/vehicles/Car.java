package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

public class Car {
    public String car_brand;
    public String class_of_car;
    public int weight;
    Driver driver;
    Engine engine;

    public Car() {

    }

    public Car(String car_brand, String class_of_car, int weight, Driver driver, Engine engine) {
        this.car_brand = car_brand;
        this.class_of_car = class_of_car;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setClass_of_car(String class_of_car) {
        this.class_of_car = class_of_car;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getClass_of_car() {
        return class_of_car;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "ОСНОВНЫЕ СВЕДЕНИЯ\nМарка автомобиля: " + this.car_brand + "\nКласс: " + this.class_of_car + "\nМасса: " + this.weight + "т" + "\nВОДИТЕЛЬ: " + this.driver + "\nДВИГАТЕЛЬ: " + this.engine;
    }
}
