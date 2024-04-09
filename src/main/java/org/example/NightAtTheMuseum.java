package org.example;

import java.util.Scanner;

//link of the problem : https://codeforces.com/contest/731/problem/A
public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 97;
        int moves = 0;
        String value = scanner.next();
        for(int i = 0; i< value.length(); i++){
            int result = Math.abs(value.toCharArray()[i] - start);
            if (result <= 13){
                moves += result;
            }else {
                moves += (26 - result);
            }
            start = value.toCharArray()[i];
        }
        System.out.println(moves);
    }
}
