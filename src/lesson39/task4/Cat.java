package lesson39.task4;

public class Cat extends Animal{
    public static void main(String[] args) {
        System.out.println(Animal.planet);
        Animal.planet = "Луна";
        System.out.println(Cat.planet);
    }
}
