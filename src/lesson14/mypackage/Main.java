package lesson14.mypackage;

import lesson14.mypackage.cars.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Car.move());

    }
}

// 1) System.out.println(lesson14.mypackage.cars.Car.move());

// 2) import lesson14.mypackage.cars.Car;
//        System.out.println(Car.move());

// 3) import static lesson14.mypackage.cars.Car.move;
//        System.out.println(move());

// 4) import static lesson14.mypackage.cars.Car.*;
//        System.out.println(move());
