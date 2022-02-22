package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    int max_speed;

    public SportCar() {

    }

    public SportCar(String car_brand, String class_of_car, int weight, Driver driver, Engine engine, int max_speed) {
        super(car_brand, class_of_car, weight, driver, engine);
        this.max_speed = max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    @Override
    public String toString() {
        return super.toString()+"\nТип: Спорткар\nМаксимальная скорость: " + this.max_speed + " км/ч";
    }
}
