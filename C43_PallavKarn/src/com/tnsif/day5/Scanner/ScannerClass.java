package com.tnsif.day5.Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String a = sc.nextLine();

        System.out.println("Enter your Department:");
        String b = sc.nextLine();

        System.out.println("Enter your year:");
        String c = sc.nextLine();

        System.out.println("Your name is " +a);
        System.out.println("Your department is " + b);
        System.out.println("Your year is " + c);
        System.out.println("Your name is "+ a + "department is "+ b + "year is "+ c);
    }
}
