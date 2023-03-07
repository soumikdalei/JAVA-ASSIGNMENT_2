package com.company;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of eggs:-");
        int eggs= sc.nextInt();
        int gross,dozen,left_over;
        gross=eggs/144;
        dozen=(eggs%144)/12;
        left_over=(eggs%144%12);
        System.out.println("Your number of eggs is "+gross+" gross "+dozen+" dozen, and "+left_over);



    }
}
