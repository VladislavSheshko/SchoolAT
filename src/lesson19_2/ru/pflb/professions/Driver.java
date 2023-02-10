package lesson19_2.ru.pflb.professions;

import lesson19_2.ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience;
    String licenseId;

    public Driver(int age, String name, int drivingExperience, String licenseId) {
        super(age, name);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Experience: " + drivingExperience +
                ", licenseId: '" + licenseId + "'";
    }
}

