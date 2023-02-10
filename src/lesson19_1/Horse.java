package lesson19_1;

public class Horse extends Animal{
    public Horse(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
    }
    @Override
    public void makeSound() {
        System.out.println("Его-го");
    }

    @Override
    public void eat(int food) {
        System.out.println("Лошадь кушает " + this.getFood());
        super.eat(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

