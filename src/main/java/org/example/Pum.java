package org.example;

import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre a number N:");
        int N = scanner.nextInt();

        for (int i = 1; i <= N*4; i++){
            int n = i;
            if((n % 4) == 0){
                System.out.print("PUM \n");
            }else {
                System.out.print(i+"  ");
            }
        }
    }
}
