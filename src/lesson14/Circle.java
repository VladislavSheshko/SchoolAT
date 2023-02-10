package lesson14;

public class Circle {
    final double radius;
    final static double PI = 3.14;

    public Circle(double radius){

        this.radius = radius;
    }
    public double getArea(){

        return  PI * (radius * radius);
    }
    public double getLength() {

        return (2 * radius) * PI;
    }
    public static void main(String[] args) {
        Circle result2 = new Circle(4);
        System.out.println("Площадь круга = " + result2.getArea());
        Circle result3 = new Circle(7);
        System.out.println("Длина круга = " + result3.getLength());
    }
}
