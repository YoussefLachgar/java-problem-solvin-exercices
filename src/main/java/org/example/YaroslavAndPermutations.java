package org.example;

import java.util.Scanner;

//link of the problem : https://codeforces.com/group/MWSDmqGsZm/contest/223207/problem/O
public class YaroslavAndPermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre the length of the array");
        int len = scanner.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++){
            System.out.println("entre the array["+i+"] : ");
            arr[i] = scanner.nextInt();
        }

        int res = 0;

        for (int i = 0; i<len; i++){
            int acc = 0;
            for (int j = 0; j<len; j++){
                if (arr[i] == arr[j]){
                    acc++;
                }
            }
            if(res < acc ){
                res = acc;
            }

        }

        if ( len % 2 == 0){
            if (res <= (len/2)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else {
            if (res <= ((len/2) + 1)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
