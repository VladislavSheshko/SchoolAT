package lesson39.task4;

public class Cat extends Animal{
    public static String planet = "Луна";
    public static void main(String[] args) {
        System.out.println(Animal.planet);
        System.out.println(Cat.planet);
    }
}
