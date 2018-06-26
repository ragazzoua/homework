package com.company;

import java.util.Arrays;

public class Main {

    static int[] values = {565, 87788, 1123300, 77455, 9996, 5, 247, 10};

    public static void main(String[] args) {


        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        System.out.println("Min to Max");
        System.out.println("---------------------------");
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value " + values[i]);
        }
        System.out.println("---------------------------");
        System.out.println("Max to Min");
        for (int i = values.length - 1; i > 0; i--) {
            System.out.println("Value " + values[i]);
        }

    }

    static void findMinMax(int[] values) {

        int min = values[0];
        int max = values[0];
        //Arrays.sort(values);

        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }

        }
        System.out.println(min);
        System.out.println(String.valueOf(min).length());
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }

        }
        System.out.println(max);
        System.out.println(String.valueOf(max).length());
    }

}
