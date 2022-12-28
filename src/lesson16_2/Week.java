package lesson16_2;

public class Week {
    Day day1;
    Day day2;
    Day day3;
    Day day4;
    Day day5;
    Day day6;
    Day day7;
    int number;

    public Week(int number, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7) {
        this.number = number;
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
        this.day4 = day4;
        this.day5 = day5;
        this.day6 = day6;
        this.day7 = day7;
    }
    @Override
    public String toString() {
        return  "Неделя: " + number + "\n" + day1 + "\n" + day2 + "\n" + day3 + "\n" + day4 + "\n" + day5 + "\n" + day6 + "\n" + day7;
    }
}
