package lesson19_2.ru.pflb.vehicles;

import lesson19_2.ru.pflb.details.Engine;
import lesson19_2.ru.pflb.professions.Driver;

public class Car {
    String model;
    VehicleClass vehicleClass;
    int weight;
    Driver driver;
    Engine engine;
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Модель = '" + model + "'" +
                ", класс автомобиля = " + vehicleClass +
                ", вес авто = " + weight + "\n" +
                ", тим мотора {" + engine.toString() + "}\n" +
                ", водитель {" + driver.toString() + "}";
    }
}

