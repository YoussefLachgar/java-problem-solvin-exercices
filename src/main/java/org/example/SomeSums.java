package org.example;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        int Inf = scanner.nextInt();
        int Sup = scanner.nextInt();
        int sum = 0;
        int b = 0;
        int t;

        for(int i = 1 ; i <= nombre ; i++){
            t = i;
            while (t != 0) {
                int chiffre = t % 10;
                t = t / 10;
                b += chiffre;

            }
            if( b <= Sup & b >= Inf ){
//                System.out.println("this b:"+b);
                sum += i;
            }
            b=0;
        }

        System.out.println(sum);
    }
}
