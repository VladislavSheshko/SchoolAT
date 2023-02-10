package lesson39.task1;


public class Cat {
    public int age;
    public String eyeColor;
    public double weight;

    public String woolColor;

    public Cat(int age) {
        this.age = age;
    }

    public Cat() {
    }

    public Cat(int age, String eyeColor) {
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public Cat(int age, String eyeColor, double weight) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public Cat(int age, String eyeColor, double weight, String woolColor) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.woolColor = woolColor;
    }

    public String toString() {
        return "Возраст: " + (age==0 ? "неизвестно" : age) + "\n" +
                "Цвет глаз: " + (eyeColor==null ? "неизвестно" : eyeColor) + "\n" +
                "Вес: " + (weight==0 ? "неизвестно" : weight) + "\n" +
                "Цвет шерсти: " + (woolColor==null ? "неизвестно" : woolColor);
    }

    public static void main(String[] args) {
        Cat cat = new Cat(7);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5, "Желтый");
        Cat cat3 = new Cat(3, "Синий", 5);
        Cat cat4 = new Cat(9, "Зеленый", 4, "Серый");
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
    }
}