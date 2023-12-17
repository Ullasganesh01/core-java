package com.myworkz.java_features.date_time_api;

import java.time.*;

public class DateTimeExecutor {
    public static void main(String[] args) {
        /*To get current date*/
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println();

        /*To get current time*/
        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println();

        /*To get date individual elements*/
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();

        System.out.println(dd+"-" +mm+"-"+yyyy);
        System.out.printf("%d-%d-%d",dd,mm,yyyy);

        System.out.println();
        System.out.println();
        /*To get time individual elements*/
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int ns = time.getNano();

        System.out.printf("%d:%d:%d:%d",h,m,s,ns);

        System.out.println();
        System.out.println();
        /*To get LocalDateTime*/
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        dd = dt.getDayOfMonth();
        mm = dt.getMonthValue();
        yyyy = dt.getYear();

        System.out.println();
        System.out.printf("%d-%d-%d",dd,mm,yyyy);

        h = dt.getHour();
        m = dt.getMinute();
        s = dt.getSecond();
        ns =dt.getNano();

        System.out.println();
        System.out.println();
        System.out.printf("%d:%d:%d:%d",h,m,s,ns);

        System.out.println();
        System.out.println();

        /*To create our own LocaleDateTime*/
        dt = LocalDateTime.of(yyyy,mm,dd,h,m);
        System.out.println(dt);

        System.out.println();
        dt = LocalDateTime.of(2001, Month.SEPTEMBER,07,12,00);
        System.out.println(dt);
        System.out.println("Date after 1 month : " + dt.plusMonths(1));
        System.out.println("Date before 1 Year : " + dt.minusYears(1));
        System.out.println("Date after 20 days : " + dt.plusDays(20));
        System.out.println("Time after 15 hrs : " + dt.plusHours(15));
        System.out.println("Time before 30 mins: " + dt.minusMinutes(30));
        System.out.println("Time after 100 secs : " + dt.plusSeconds(100));

        System.out.println();

        /*Period functions*/
        LocalDate bday = LocalDate.of(2001,10,01);
        LocalDate today = LocalDate.now();

        Period age = Period.between(bday,today);
        System.out.println(age.getYears()+" "+ age.getMonths()+ " "+ age.getDays());
        System.out.printf("%d years %d months %d days",age.getYears(),age.getMonths(),age.getDays());

        System.out.println();

        /*To get Year*/
        Year y = Year.of(2024);
        System.out.println(y.isLeap());

        System.out.println();

        /*To get Zone*/
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId america = ZoneId.of("America/Los_Angeles");
        /*Zoned Date Time*/
        ZonedDateTime aT = ZonedDateTime.now(america);
        System.out.println(aT);
    }
}
