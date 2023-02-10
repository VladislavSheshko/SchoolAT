package lesson19_1;

public class Dog extends Animal{
    public Dog(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав - Гав");
    }

    @Override
    public void eat(int food) {
        System.out.println("Собака кушает " + this.getFood());
        super.eat(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

