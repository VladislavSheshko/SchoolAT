package lesson19_1;

public class Vet {
    String name;

    public void treatAnimal(Animal animal) {
        if (HealthState.HEALTHY.equals(animal.getHealthState())) {
            System.out.println("Животное " + animal.getName() + " здорово");
        } else {
            animal.setHealthState(HealthState.HEALTHY);
            System.out.println("Животное вылечено ветеринором " + animal.getName());
        }
    }

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

