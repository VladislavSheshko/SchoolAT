package lesson16_1;


public class Main {
    public static void main(String[] args) {
//        Week firstWeek = new Week(1,
//                new Day(1, DaysOfWeek.SATURDAY),
 //               new Day(2, DaysOfWeek.SUNDAY));
        Week secondWeek = new Week(2,
                new Day(3, DaysOfWeek.MONDAY),
                new Day(4, DaysOfWeek.TUESDAY),
                new Day(5, DaysOfWeek.WEDNESDAY),
                new Day(6, DaysOfWeek.THURSDAY),
                new Day(7, DaysOfWeek.FRIDAY),
                new Day(8, DaysOfWeek.SATURDAY),
                new Day(9, DaysOfWeek.SUNDAY));
        Week thirdWeek = new Week(3,
                new Day(10, DaysOfWeek.MONDAY),
                new Day(11,DaysOfWeek.TUESDAY),
                new Day(12, DaysOfWeek.WEDNESDAY),
                new Day(13, DaysOfWeek.THURSDAY),
                new Day(14, DaysOfWeek.FRIDAY),
                new Day(15, DaysOfWeek.SATURDAY),
                new Day(16, DaysOfWeek.SUNDAY));
        Week fourthWeek = new Week(4,
                new Day(17, DaysOfWeek.MONDAY),
                new Day(18,DaysOfWeek.TUESDAY),
                new Day(19, DaysOfWeek.WEDNESDAY),
                new Day(20, DaysOfWeek.THURSDAY),
                new Day(21, DaysOfWeek.FRIDAY),
                new Day(22, DaysOfWeek.SATURDAY),
                new Day(23, DaysOfWeek.SUNDAY));
//        System.out.println(firstWeek+"\n");
//        Хотел первые два дня тоже вывести,
//        Week переопределил на др кол-во входных данных, а как допилить toString,
//        чтобы он null в оставшиеся 5 дней не выводил, не понял
        System.out.println(secondWeek+"\n");
        System.out.println(thirdWeek+"\n");
        System.out.println(fourthWeek);
    }
}
