package org.example;

import java.util.Scanner;

public class SumOfConsectuveOddNubmers {

//    Given two numbers X and Y. Print the sum of all odd numbers between them, excluding X and Y.
//
//    Input
//    First line contains a number T (1 ≤ T ≤ 10) number of test cases.
//
//    Next T lines will contain two numbers X and Y (0 ≤ X, Y ≤ 104).
//
//    Output
//    Print the sum of all odd numbers between X and Y (excluding X and Y).


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of times you want to use this code:");
        int numberOfIterations = scanner.nextInt();

        for (int currentIteration = 0; currentIteration < numberOfIterations; currentIteration++) {
            // Logic to calculate the sum of odd numbers between two user-provided inputs
            int[] numbers = new int[2];
            int firstNumber;
            int lastNumber;

            System.out.println("Enter the first number:");
            numbers[0] = scanner.nextInt();

            System.out.println("Enter the last number:");
            numbers[1] = scanner.nextInt();

            firstNumber = Math.min(numbers[0],numbers[1]);
            lastNumber = Math.max(numbers[0],numbers[1]);

            int sumOfOdds = 0;
            for (int number = firstNumber + 1; number < lastNumber; number++) {
                if (number % 2 != 0) {
                    sumOfOdds += number;
                }
            }

            System.out.println("The sum of odd numbers between " + firstNumber + " and " + lastNumber + " is: " + sumOfOdds);
        }

        scanner.close(); // Close the Scanner object to avoid resource leaks
    }
}
