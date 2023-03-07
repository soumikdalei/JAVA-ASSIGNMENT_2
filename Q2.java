package com.company;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the distance in km=");
        int km=sc.nextInt();
        double m=km*1000;
        double f=km*3280.8399;
        double i=km*39370.0787;
        int c=km*100000;
        System.out.println(km+" km is "+m+" meters ");
        System.out.println(km+" km is "+f+" feet ");
        System.out.println(km+" km is "+i+" inch ");
        System.out.println(km+" km is "+c+" centimeters");
    }
}
