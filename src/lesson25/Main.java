package lesson25;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDateTime startCreateDate;
        LocalDateTime endCreateDate;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;

        // 1
        LocalDateTime startDate = LocalDateTime.now();

        startCreateDate = LocalDateTime.now();
        Date date = new Date(95, 7, 29, 21, 55, 0);
        System.out.println("---Date---");
        System.out.println(date);
        System.out.println(new SimpleDateFormat("HH dd-yyyy").format(date));
        System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(date));
        System.out.println(new SimpleDateFormat().format(date));
        System.out.println(new SimpleDateFormat("KK-mm a").format(date));
        System.out.println(new SimpleDateFormat("HH-mm MMMM.yyyy", new DateFormatSymbols(Locale.ENGLISH)).format(date));
        endCreateDate = LocalDateTime.now();
        double timeCreateDate = Duration.between(startCreateDate, endCreateDate).toMillis();

        startCreateDate = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(1995, 8, 29);
        System.out.println("---LocalDate---");
        System.out.println(localDate);
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(localDate));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(localDate.atStartOfDay()));
        System.out.println(DateTimeFormatter.ofPattern("MM.yy").format(localDate));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDate.atStartOfDay()));
        endCreateDate = LocalDateTime.now();
        double timeCreateLocalDate = Duration.between(startCreateDate, endCreateDate).toMillis();

        startCreateDate = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(1995, 8, 29, 21, 55);
        System.out.println("---LocalDateTime---");
        System.out.println(localDateTime);
        System.out.println(DateTimeFormatter.ISO_TIME.format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(localDateTime));
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yy").format(localDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime));
        endCreateDate = LocalDateTime.now();
        double timeCreateLocalDateTime = Duration.between(startCreateDate, endCreateDate).toMillis();


        startCreateDate = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("---ZoneDateTime---");
        System.out.println(zonedDateTime);
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(zonedDateTime));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));
        endCreateDate = LocalDateTime.now();
        double timeCreateZonedDateTime = Duration.between(startCreateDate, endCreateDate).toMillis();

        startCreateDate = LocalDateTime.now();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1995, 7, 29);
        System.out.println("---GregorianCalendar---");
        System.out.println(gregorianCalendar.getTime());
        ZonedDateTime zoneGregorianCalendar = gregorianCalendar.toZonedDateTime();
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zoneGregorianCalendar));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(zoneGregorianCalendar));
        System.out.println(DateTimeFormatter.ofPattern("MMMM.yyyy", new Locale("fr")).format(zoneGregorianCalendar));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zoneGregorianCalendar));
        endCreateDate = LocalDateTime.now();
        double timeCreateGregorianCalendar = Duration.between(startCreateDate, endCreateDate).toMillis();

        LocalDateTime endDate = LocalDateTime.now();
        double timeFirstPart = Duration.between(startDate, endDate).toMillis();

        // 2
        Date date1 = new Date();
        System.out.println("different 'Data': " + Duration.ofMillis(date1.getTime() - date.getTime()));

        LocalDate localDate1 = LocalDate.now();
        System.out.println("different 'LocalDate': " + Duration.between(localDate.atStartOfDay(), localDate1.atStartOfDay()));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("different 'LocalDateTime': " + Duration.between(localDateTime, localDateTime1));

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println("different 'ZonedDateTime': " + Duration.between(zonedDateTime, zonedDateTime1));

        GregorianCalendar gregorianCalendar1 = new GregorianCalendar();
        System.out.println("different 'GregorianCalendar': " + Duration.between(gregorianCalendar.toZonedDateTime(), gregorianCalendar1.toZonedDateTime()));

        //3
        System.out.println("execution time first part: " + timeFirstPart + "(ms)");

        //4
        System.out.println("Date: " + timeCreateDate + "(ms)");
        System.out.println("LocalDate: " + timeCreateLocalDate + "(ms)");
        System.out.println("LocalDateTime: " + timeCreateLocalDateTime + "(ms)");
        System.out.println("ZonedDateTime: " + timeCreateZonedDateTime + "(ms)");
        System.out.println("GregorianCalendar: " + timeCreateGregorianCalendar + "(ms)");

    }
}


