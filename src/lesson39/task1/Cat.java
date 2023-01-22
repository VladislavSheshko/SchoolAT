package lesson39.task1;

public class Cat {
    // с конструктарами вроде справился, а как для каждого свой вывод toString вернуть,
    // красивого ничего не придумал
    public int age;
    public String eyeColor;
    public double weight;

    public String woolColor;

    Cat(int age) {
        this.age = age;
    }
    Cat() {}
    Cat(int age, String eyeColor) {
        this.age = age;
        this.eyeColor = eyeColor;
    }
    Cat(int age, String eyeColor, double weight) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
    }
    Cat(int age, String eyeColor, double weight, String woolColor) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.woolColor = woolColor;
    }
    public String toString() {
        return "";
    }
    public String toString1() {
        return  "Возраст: " + age;
    }
    public String toString2() {
        return  "Возраст: " + age + "\n" +
                "Цвет глаз: " + eyeColor;
    }
    public String toString3() {
        return  "Возраст: " + age + "\n" +
                "Цвет глаз: " + eyeColor + "\n" +
                "Вес: " + weight + "\n";
    }
    public String toString4() {
        return  "Возраст: " + age + "\n" +
                "Цвет глаз: " + eyeColor + "\n" +
                "Вес: " + weight + "\n" +
                "Цвет шерсти: " + woolColor;
    }
    public static void main(String[] args) {
        Cat cat = new Cat(7);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5, "Желтый");
        Cat cat3 = new Cat(3, "Синий", 5);
        Cat cat4 = new Cat(9, "Зеленый", 4, "Серый");
        System.out.println(cat.toString1());
        System.out.println(cat1.toString());
        System.out.println(cat2.toString2());
        System.out.println(cat3.toString3());
        System.out.println(cat4.toString4());
    }
}