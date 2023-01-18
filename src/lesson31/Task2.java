package lesson31;

public class Task2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 15;
        a = a + b - (b = a);
        System.out.println(a);
        System.out.println(b);
    }
}
