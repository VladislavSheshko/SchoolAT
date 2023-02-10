package lesson16_2;

public class Day {
    int number;
    String daysOfWeek;

    public Day(int number, String daysOfWeek) {
        this.number = number;
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return  daysOfWeek  + " - " + number;
    }
}
