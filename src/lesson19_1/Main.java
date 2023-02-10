package lesson19_1;

public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet("Владислав");

        Animal dog = new Dog("Чиж", "Мясо", 100, "Россия", HealthState.HEALTHY);
        Animal cat = new Cat("Серый", "Рыба", 50, "Турция", HealthState.HEALTHY);
        Animal horse = new Horse("Пегас", "Трава", 1000, "Армения", HealthState.UNHEALTHY);

        Animal[] animals = {dog, cat, horse};

        for (Animal an : animals) {
            System.out.println(an.toString());
            an.makeSound();
            an.eat(10);
            vet.treatAnimal(an);
        }
        cat.sleep();
    }
}
