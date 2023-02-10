package lesson39.task2;

public class Summa {

    public static int getSumma(int a, int b) {
        return a + b;
    }

    public static double getSumma(int a, int b, int c) {
        return a + b + c;
    }

    public static double getSumma(double x, double y) {
        return x + y;
    }

    public static double getSumma(double x, double y, double z) {
        return x + y + z;
    }

    public static double getSumma(int a, double x, double y) {
        return a + x + y;
    }

    public static double getSumma(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = 2;
        double x = 0.3;
        double y = 1.5;
        double z = 3.5;
        Integer num1 = 8;
        Integer num2 = 3;
        System.out.println(getSumma(a, b));
        System.out.println(getSumma(a, b, c));
        System.out.println(getSumma(x, y));
        System.out.println(getSumma(x, y, z));
        System.out.println(getSumma(a, x, y));
        System.out.println(getSumma(num1, num2));
    }
}
