package lesson19_2.ru.pflb.vehicles;

import lesson19_2.ru.pflb.details.Engine;
import lesson19_2.ru.pflb.professions.Driver;

public class SportCar extends Car{
    int maxVelocity;

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public SportCar(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine, int maxVelocity) {
        super(model, VehicleClass.SPORTS_CAR, weight, driver, engine);
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                ", maxVelocity = " + maxVelocity;
    }
}


