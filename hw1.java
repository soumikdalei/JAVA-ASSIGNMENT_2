package com.company;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        double minutes,days,years;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no in minutes:");
        minutes=sc.nextDouble();
        years=minutes/60/24/365;
        days=(minutes/60.0/24.0/365.0-years)*365;
        System.out.println(minutes+" minutes is approximately "+(int)years+" years and "+days+" days ");


}
}
