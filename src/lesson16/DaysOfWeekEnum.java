package lesson16;

public enum DaysOfWeekEnum {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресение");
    private final String dayName;
    DaysOfWeekEnum(String dayName) {
        this.dayName = dayName;
    }
    public String getDayName() {
        return dayName;
    }
}
