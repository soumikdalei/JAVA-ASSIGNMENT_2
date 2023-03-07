package com.company;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit:");
        double f=sc.nextDouble();
        double c=(f-32)*(5d/9d);
        System.out.println(f+" Fahrenheit is "+c+" Celsius ");

    }
}
