package lesson43;

//    В программу через аргументы командной строки передаются
//    три натуральных числа – стороны треугольника.
//
//
//    Необходимо определить тип треугольника с данными сторонами
//            (остроугольный, тупоугольный, прямоугольный)
//    вывести одно из слов:
//            - right для прямоугольного треугольника,
//- acute для остроугольного треугольника,
//- obtuse для тупоугольного треугольника
//- или impossible, если входные числа не образуют треугольника.
//
//
//    Стороны сторон передаются через аргументы командной строки.
//    Проверку на наличие аргументов делать не надо.
public class Task4 {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);

        if ((a + b > c) && (c + b > a) && (a + c > b)) {
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a)) {
                System.out.println("right");
            } else if ((a * a + b * b < c * c) || (a * a + c * c < b * b) || (c * c + b * b < a * a)) {
                System.out.println("obtuse");
            } else if ((a * a + b * b > c * c) || (a * a + c * c > b * b) || (c * c + b * b > a * a)) {
                System.out.println("acute");
            }
        } else
            System.out.println("impossible");
        }
}

