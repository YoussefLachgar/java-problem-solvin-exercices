package org.example;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if ((num % 2 == 0) && ((num/2) % 2 == 0)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}