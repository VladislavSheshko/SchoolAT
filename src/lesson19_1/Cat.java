package lesson19_1;

public class Cat extends Animal{
    public Cat(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу - Мяу");
    }

    @Override
    public void eat(int food) {
        System.out.println("Кот кушает " + this.getFood());
        super.eat(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


