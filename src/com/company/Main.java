package com.company;

import java.util.Arrays;

public class Main {

    static int[] values = {565, 87788, 1123300, 77455, 9996, 5, 247, 10};

    public static void main(String[] args) {



findMinMax(values);
    }

    static void findMinMax(int[] values){

        int min = values[0];
        int max = values[0];
        //Arrays.sort(values);

        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }

        }
        System.out.println("Minimum number - " + min);
        System.out.println("Length of minimum number - " + String.valueOf(min).length());
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }

        }
        System.out.println("Max number - " + max);
        System.out.println("Length of max number - " + String.valueOf(max).length());
    }

}
