package lesson10;

import java.math.BigDecimal;

public class ArithmeticOperationBigDecimal {
    public static void main(String[] args) {
        BigDecimal one = new BigDecimal("20000000000.000000002");
        BigDecimal two = new BigDecimal("2000000000000.0000055");
        BigDecimal result1 = one.add(two);          // сложение
        System.out.println(result1);

        BigDecimal three = new BigDecimal("5000000000000.00000003");
        BigDecimal four = new BigDecimal("30000000000000.0000002");
        BigDecimal result2 = three.subtract(four);  // вычетание
        System.out.println(result2);

        BigDecimal five = new BigDecimal("1000000000000000.00002");
        BigDecimal six = new BigDecimal("30000000000000000.0004");
        BigDecimal result3 = five.multiply(six);    //умножение
        System.out.println(result3);

        BigDecimal seven = new BigDecimal("60.10");
        BigDecimal eight = new BigDecimal("30.02");
        BigDecimal result4 = seven.divide(eight, 5, BigDecimal.ROUND_HALF_UP); //  Округление вверх, если последнее число после запятой >= .5, а 5 после eight говорит сколько знаков после запятой выводить.
        System.out.println(result4);              // деление без остатка

        // не нашел метода, который бы у данного класса возвращал отстаток от деления
    }
}
