package lesson43;

import java.util.logging.SocketHandler;

public class Task2 {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]);
        if ((x >= 1) & (x <= 7)) {
            switch (x) {
                case 1:
                    System.out.println(x + " - Понедельник");
                    break;
                case 2:
                    System.out.println(x + " - Вторник");
                    break;
                case 3:
                    System.out.println(x + " - Среда");
                    break;
                case 4:
                    System.out.println(x + " - Четверг");
                    break;
                case 5:
                    System.out.println(x + " - Пятница");
                    break;
                case 6:
                    System.out.println(x + " - Суббота");
                    break;
                case 7:
                    System.out.println(x + " - Воскресенье");
                    break;
            }
        } else {
            System.out.println("Данное число не входит в указанный диапазон");
        }
    }
}
