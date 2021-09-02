package com.company;

public class Main {

    public static void main(String[] args) {

        double hour = 21;
        double minute = 31;
        double second = 10;

        double minute_In_Total = minute + (hour * 60);
        double seconds_In_Total = minute_In_Total * 60 + second;

        double Total_Seconds_In_A_Day = 86400;

        System.out.println("Number of seconds since midnight is: " +  seconds_In_Total );

        System.out.println("Number of seconds left today is; " + (Total_Seconds_In_A_Day - seconds_In_Total));



        System.out.println(  (seconds_In_Total / Total_Seconds_In_A_Day) * 100 + "% of the day has passed" );

    }
}
