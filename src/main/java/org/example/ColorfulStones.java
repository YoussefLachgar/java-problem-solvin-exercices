package org.example;

import java.util.Scanner;

public class ColorfulStones {
//    link of the problem : https://codeforces.com/contest/265/problem/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String instruction = scanner.next();
        int counter = 1;

        for (int i = 0; i < instruction.length(); i++){
            if(instruction.toCharArray()[i] == value.toCharArray()[counter - 1]){
                counter++;
            }
        }
        System.out.println("the cursor on the position : "+ counter);
    }
}
