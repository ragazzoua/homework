package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me too numbers and press Enter after each");

        int x = scanner.nextInt();
        int y = scanner.nextInt();


        if (x > y) {
            System.out.println("Max Value " + x);
            System.out.println("Min Value " + y);
        } else {
            System.out.println("Min Value " + x);
            System.out.println("Max Value " + y);
        }
        String str = String.valueOf(x);
        String str1 = String.valueOf(y);
        x = str.length();
        y = str1.length();

        System.out.println(x);
        System.out.println(y);
        System.out.println("------------------");
        System.out.println("Min to Max");
        if (x > y) {
            System.out.println(y);
            System.out.println(x);
        }
        else {
            System.out.println(x);
            System.out.println(y);
        }

        System.out.println("------------------");
        System.out.println("Max to Min");
        if (x > y) {
            System.out.println(x);
            System.out.println(y);
        }
        else {
            System.out.println(y);
            System.out.println(x);
        }

    }

}
