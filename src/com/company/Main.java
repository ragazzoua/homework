package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me too numbers and press Enter after each");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("First number " + x);
        System.out.println("Second number " + y);
        System.out.println(x + y);
        System.out.println(x * y);

    }


}


