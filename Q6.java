package com.company;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in seconds :");
        double a=sc.nextDouble();
        double g=32.174d;
        double d=(1d/2d)*g*Math.pow(a,2);
        System.out.println("Distance travelled :"+d);

    }
}
