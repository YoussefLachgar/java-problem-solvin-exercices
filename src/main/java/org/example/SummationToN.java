package org.example;

import java.util.Scanner;

public class SummationToN {
    public static void main(String[] args) {
//        Given a number N. Print the summation of the numbers that is between 1 and N (inclusive).
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        long sum = ((long) num* (num+1)) / 2;
        System.out.println(sum);
    }
}
