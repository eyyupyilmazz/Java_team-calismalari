package day30_immutableClasses;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime time =LocalTime.now();

        System.out.println(time);

        System.out.println(time.getHour());

        System.out.println(time.minusMinutes(1000));

        System.out.println(time.plusSeconds(100000));

        System.out.println(time.withHour(15));


    }





}
