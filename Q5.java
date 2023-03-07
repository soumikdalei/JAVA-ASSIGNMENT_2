package com.company;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere:");
        double r= sc.nextDouble();
        double a=3f*Math.PI*Math.pow(r,2);
        double b=(2d/3d)*Math.PI*Math.pow(r,3);
        System.out.println("The surface are of the hemisphere "+a);
        System.out.println("The volume area of the hemisphere "+b);
    }
}
