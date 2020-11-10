package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

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

        int inputnumber = 0;
        boolean found = false;
        while (!found) {
            System.out.println();
            System.out.print("Please input the number");
            inputnumber = scanner.nextInt() + 1;
            for (int i = 0; i < array.length; i++) {
                if (inputnumber == i) {
                    found = true;

                    break;
                }
            }

                }
                if (!found) {

                    System.out.println("Wrong number, please try again");
                }
            }
        }
    }
}

