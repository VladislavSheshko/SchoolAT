package lesson19_2.ru.pflb.details;

public class Engine {
    int power;
    String vendor;

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "power=" + power +
                ", vendor='" + vendor + "'";
    }
}

