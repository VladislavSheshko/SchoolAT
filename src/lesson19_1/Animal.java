package lesson19_1;

public abstract class Animal {
    String name;
    String food;
    int foodCounter;
    String location;
    static int counter;
    HealthState health;

    {
        counter++;
    }

    public Animal(String name, String food, int foodCounter, String location, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getFoodCounter() {
        return foodCounter;
    }

    public void setFoodCounter(int foodCounter) {
        this.foodCounter = foodCounter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCounter() {
        return counter;
    }

    public HealthState getHealthState() {
        return health;
    }

    public void setHealthState(HealthState health) {
        this.health = health;
    }

    public void makeSound() {
        System.out.println("я бесшумный");
    }

    public void eat(int foodCounter) {
        this.foodCounter -= foodCounter;
        System.out.println("Кушает: " + this.foodCounter);
    }

    public void sleep() {
        System.out.println("Животное " + name + " спит");
    }

    @Override
    public String toString() {
        return name + "\n" +
                "Страна обитания: " + location + "\n"+
                "Состояние здоровья: " + health + "\n" +
                "Количество особей: " + counter;
    }
}


