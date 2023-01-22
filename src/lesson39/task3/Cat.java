package lesson39.task3;

public class Cat extends Animal {
    static Cat cat1 = new Cat(); // может ли когда то понадобиться объявление статического экземпляра?
    public static void main(String[] args) {
        System.out.println(Animal.testStaticMethod());
        System.out.println(Cat.testStaticMethod());
        System.out.println(testStaticMethod());
        Cat cat = new Cat();
        System.out.println(cat.testStaticMethod()); // а корректно ли так делать? просто идея не предлагает
        //вызов данного методо после нажатия на точку
        System.out.println(cat1.testStaticMethod()); // тот же вопрос, имеет ли смылс так делать?
    }
}