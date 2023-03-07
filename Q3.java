package com.company;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your basic salary");
        double salary=sc.nextDouble();
        double DA=0.4*salary;
        double HRA=0.2*salary;
        double g=DA+HRA+salary;
        System.out.println("DA is "+DA);
        System.out.println("HRA is "+HRA);
        System.out.println("Gross salary is "+g);


    }
}
