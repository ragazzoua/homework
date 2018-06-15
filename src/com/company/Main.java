package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите пароль ");

        Scanner scanner = new Scanner(System.in);
        String password1 = scanner.next();
        String password2 = "password2";

        if (password1.equals(password2)) {
            System.out.println("You are lucky");
        } else {
            System.out.println("You are lose");
        }

    }
}

