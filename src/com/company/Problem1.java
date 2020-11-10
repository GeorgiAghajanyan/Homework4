package com.company;

import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        Random random = new Random();


        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int number = random.nextInt(25);

                if (number % 2 == 0) {
                    array[i] = number;
                    break;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ",");
        }
        int sum =0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }
        System.out.println();
        System.out.print("Sum values of an array is  "+sum);
    }
}
