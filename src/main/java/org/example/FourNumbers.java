package org.example;

import java.util.Scanner;

public class FourNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long result = (long) a*b*c*d;
        System.out.println("the result is : "+ result);

    }
}
