package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(420, "Tesla");
        Driver carDriver = new Driver("Русецкий Л. С.", 18, 0);
        Car car = new SportCar("Tesla", "Top", 2, carDriver, carEngine, 320);
        System.out.println(car);
    }
}
