package com.company;

import java.util.Arrays;

public class Main {

    static int[] values = {10, 20, 30, 40, 50, 60, 70, 100};

    public static void main(String[] args) {

        int ammountAllNumbers = 0;
        int NumbersCount = 0;
        for (int i = 0; i < values.length; i++)
        {
            ammountAllNumbers += values[i];
            NumbersCount ++;
        }
        int averageAmount = ammountAllNumbers / NumbersCount;
        System.out.println(averageAmount);
        System.out.println("Numbers less then avarage");
        for (int i = 0; i < values.length; i++)
        {
            if(values[i] < averageAmount)
            {
                System.out.println("Value " + values[i] + " - > Number of Chars " + String.valueOf(values[i]).length());
            }
        }
        System.out.println("Numbers bigger then avarage");
        for (int i = 0; i < values.length; i++)
        {
            if(values[i] > averageAmount)
            {
                System.out.println("Value " + values[i] + " - > Number of Chars " + String.valueOf(values[i]).length());
            }
        }
    }

        
        
        
        

        /*Arrays.sort(values);
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

}*/

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
