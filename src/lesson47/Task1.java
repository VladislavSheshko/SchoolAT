package lesson47;

//Напишите программу, которая получает два целых числа m и n
//        через аргументы командной строки и печатает целые числа x:
//        m <= x <= n, которые делятся на 3, но не делятся на 5.
public class Task1 {
    public static void main(String[] args) {
        int m = Integer.valueOf(args[0]);
        int n = Integer.valueOf(args[1]);
        for (int i = m; i < n + 1; i++) {
            if(i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
        }
    }
}
