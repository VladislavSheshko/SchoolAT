package lesson31;

public class Task3 {
    public static void main(String[] args) {
            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);
            boolean result = a % b == 0;
            System.out.println(result);
    }
}
