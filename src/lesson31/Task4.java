package lesson31;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //  P*e^(r*t)   Ответ:  51361.016667509655 (При вводе 40000 0.05 5)

        double P = Double.valueOf(args[0]);
        double r = Double.valueOf(args[1]);
        double t = Double.valueOf(args[2]);
        double sum = P * Math.pow(Math.exp(1.0),(r*t));
        System.out.println(sum);
    }
}

