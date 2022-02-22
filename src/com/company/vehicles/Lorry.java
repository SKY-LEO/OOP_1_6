package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int load_capacity;

    public Lorry() {

    }

    public Lorry(String car_brand, String class_of_car, int weight, Driver driver, Engine engine, int load_capacity) {
        super(car_brand, class_of_car, weight, driver, engine);
        this.load_capacity = load_capacity;
    }

    public void setLoad_capacity(int load_capacity) {
        this.load_capacity = load_capacity;
    }

    public int getLoad_capacity() {
        return load_capacity;
    }

    @Override
    public String toString() {
        return super.toString()+"\nТип: Грузовик\nГрузоподъёмность: " + this.load_capacity + " т";
    }
}
