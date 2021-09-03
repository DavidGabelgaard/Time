package com.company;


import java.text.DecimalFormat;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {

        LocalTime current_time = LocalTime.now();

        double hour = current_time.getHour();
        double minute = current_time.getMinute();
        double second = current_time.getSecond();

        double minute_In_Total = minute + (hour * 60);
        double seconds_In_Total = minute_In_Total * 60 + second;

        double Total_Seconds_In_A_Day = 86400;

        System.out.println("Number of seconds since midnight is: " +  seconds_In_Total );

        System.out.println("Number of seconds left today is; " + (Total_Seconds_In_A_Day - seconds_In_Total));

        System.out.println(new DecimalFormat("#.##").format  (seconds_In_Total / Total_Seconds_In_A_Day * 100) + "% of the day has passed" );

    }
}
