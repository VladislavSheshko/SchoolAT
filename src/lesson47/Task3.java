package lesson47;

import java.util.Arrays;

//Напишите метод snakePrint(int n, int col),
//        который выводит числа "змейкой" от 1 до n:
//        1 2 3 4
//        8 7 6 5
//        9 10 11 12
//        ... n
//        где:
//        n - максимальное число
//        col - количество цифр в одной строке
//        Выводимые числа разделены пробелами.
//        Используя реализованный метод, напишите программу, которая через
//        аргументы командной строки получает целочисленные значения n и col,
//        а затем печатает соответствующего размера змейку.
//        Проверку на наличие аргументов делать не надо.
//        Сделайте проверку, что n больше или равно 1, а m больше 0.
//        В противном случае выведите сообщение об ошибке
//        и завершите программу.
public class Task3 {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int col = Integer.valueOf(args[1]);
        int[] allNumber = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            allNumber[i] = i + 1;
        }
        boolean direction = true;
        int count = 0;
        String result = "";
        for (int i = 0; i < allNumber.length; i++) {

                if (direction){
                    result = result + allNumber[i] + " ";
                } else {
                    result = allNumber[i] + " " + result;
                } count++;
            if (count == col) {
                System.out.print(result);
                direction = direction ? false : true;
                System.out.println();
                result = "";
                count = 0;
            }
        }
    }
}


