package lesson16_2;



public class Main {

    public static void main(String[] args) {
        Week thirdWeek = new Week(3,
                new Day(10, DaysOfWeekEnum.MONDAY.getDayName()),
                new Day(11, DaysOfWeekEnum.TUESDAY.getDayName()),
                new Day(12, DaysOfWeekEnum.WEDNESDAY.getDayName()),
                new Day(13, DaysOfWeekEnum.THURSDAY.getDayName()),
                new Day(14, DaysOfWeekEnum.FRIDAY.getDayName()),
                new Day(15, DaysOfWeekEnum.SATURDAY.getDayName()),
                new Day(16, DaysOfWeekEnum.SUNDAY.getDayName()));
        Week fourthWeek = new Week(4,
                new Day(17, DaysOfWeekEnum.MONDAY.getDayName()),
                new Day(18, DaysOfWeekEnum.TUESDAY.getDayName()),
                new Day(19, DaysOfWeekEnum.WEDNESDAY.getDayName()),
                new Day(20, DaysOfWeekEnum.THURSDAY.getDayName()),
                new Day(21, DaysOfWeekEnum.FRIDAY.getDayName()),
                new Day(22, DaysOfWeekEnum.SATURDAY.getDayName()),
                new Day(23, DaysOfWeekEnum.SUNDAY.getDayName()));
        Week fithWeek = new Week(5,
                new Day(24, DaysOfWeekEnum.MONDAY.getDayName()),
                new Day(25, DaysOfWeekEnum.TUESDAY.getDayName()),
                new Day(26, DaysOfWeekEnum.WEDNESDAY.getDayName()),
                new Day(27, DaysOfWeekEnum.THURSDAY.getDayName()),
                new Day(28, DaysOfWeekEnum.FRIDAY.getDayName()),
                new Day(29, DaysOfWeekEnum.SATURDAY.getDayName()),
                new Day(30, DaysOfWeekEnum.SUNDAY.getDayName()));
        System.out.println(thirdWeek+"\n");
        System.out.println(fourthWeek+"\n");
        System.out.println(fithWeek);
    }
}
