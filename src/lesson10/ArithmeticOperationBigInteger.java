package lesson10;

import java.math.BigInteger;

public class ArithmeticOperationBigInteger {
    public static void main(String[] args) {
        BigInteger one = new BigInteger("200000000000000000002");
        BigInteger two = new BigInteger("200000000000000000055");
        BigInteger result1 = one.add(two);  //сложение
        System.out.println(result1);

        BigInteger three = new BigInteger("500000000000000000003");
        BigInteger four = new BigInteger("300000000000000000002");
        BigInteger result2 = three.subtract(four);  //вычетание
        System.out.println(result2);

        BigInteger five = new BigInteger("100000000000000000002");
        BigInteger six = new BigInteger("300000000000000000004");
        BigInteger result3 = five.multiply(six);   //умножение
        System.out.println(result3);

        BigInteger seven = new BigInteger("600000000000000000006");
        BigInteger eight = new BigInteger("300000000000000000002");
        BigInteger result4 = seven.divide(eight); //деление без остатка
        System.out.println(result4);  // почему в ответе 2? из-за того что в числе seven содержится 2 значения eight,
        // а остаток просто отбрасывается?

        BigInteger nine = new BigInteger("400000000000000000008");
        BigInteger ten = new BigInteger("200000000000000000003");
        BigInteger result5 = nine.mod(ten);  //Остаток от деления
        System.out.println(result5);

    }
}
