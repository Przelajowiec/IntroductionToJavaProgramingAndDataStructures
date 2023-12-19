package pl.harrier.java.roz9;

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {


        Date date1 = new Date(10000);
        Date date2 = new Date(100000);
        Date date3 = new Date(1000000);
        Date date4 = new Date(10000000);
        Date date5 = new Date(100000000);
        Date date6 = new Date(1000000000);
        Date date7 = new Date(10000000000L);
        Date date8 = new Date(100000000000L);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);
        System.out.println(date7);
        System.out.println(date8);

    }
}
