package day31_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih1= LocalDate.now();
        System.out.println(tarih1);

        System.out.println(tarih1.getMonth());
        System.out.println(tarih1.getMonthValue());
        System.out.println(tarih1.getDayOfYear());
        System.out.println(tarih1.isLeapYear());
        LocalDate tarih2=LocalDate.of(2016,1,1);
        System.out.println(tarih2.isLeapYear());
        System.out.println(tarih1.isAfter(tarih2));
        System.out.println(tarih1.withYear(2022));//2022-08-04
        System.out.println(tarih1.lengthOfYear());//365
        System.out.println(tarih1.lengthOfMonth());//31


    }





}
