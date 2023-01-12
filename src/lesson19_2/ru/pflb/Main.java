package lesson19_2.ru.pflb;

import lesson19_2.ru.pflb.details.Engine;
import lesson19_2.ru.pflb.professions.Driver;
import lesson19_2.ru.pflb.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Driver driverOne = new Driver(1925, "Владислав", 5, "ЕН65-75");
        Driver driverTwo = new Driver(37, "Евгений", 12, "ЕН77-55");

        Engine engineOne = new Engine(700, "Maz-engine");
        Engine engineTwo = new Engine(900, "BMW1");

        Lorry lorry = new Lorry("Maz", VehicleClass.SPORTS_CAR, 5000, driverOne, engineOne, 2000);
        System.out.println(lorry.toString());

        SportCar sportCar = new SportCar("Porsche 911", VehicleClass.MEDIUM, 1500, driverTwo, engineTwo, 300);
        System.out.println(sportCar.toString());

        Car car = new Car("Zaporogezch", VehicleClass.MINI, 900, driverOne, new Engine(50, "ZAZ"));
        System.out.println(car.toString());
    }
}

