package lesson19_2.ru.pflb.vehicles;

import lesson19_2.ru.pflb.details.Engine;
import lesson19_2.ru.pflb.professions.Driver;

import java.util.Scanner;

public class Lorry  extends Car{
    int loadingAmount;

    public int getLoadingAmount() {
        return loadingAmount;
    }

    public void setLoadingAmount(int loadingAmount) {
        this.loadingAmount = loadingAmount;
    }

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(VehicleClass vehicleClass) {
        if (vehicleClass.equals(VehicleClass.MEDIUM) || vehicleClass.equals(VehicleClass.LARGE))
            this.vehicleClass = vehicleClass;
        else System.out.println("Класс может быть только MEDIUM или LARGE");
    }

    public Lorry(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine, int loadingAmount) {
        super(model, vehicleClass, weight, driver, engine);
        this.loadingAmount = loadingAmount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой будет грузовик? Введите цифру 1 или 2." + "\n" + "1 - MEDIUM, 2 - LARGE");

        int res = 0;
        if (scanner.hasNextInt())
            res = scanner.nextInt();
        scanner.close();

        VehicleClass vs;
        switch (res) {
            case 1:
                vs = VehicleClass.MEDIUM;
                break;
            case 2:
                vs = VehicleClass.LARGE;
                break;
            default:
                System.out.println("Введено что-то не то. Тип будет установлен MEDIUM");
                vs = VehicleClass.MEDIUM;
                break;
        }
        this.setVehicleClass(vs);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + ", loadingAmount = " + loadingAmount;
    }
}

