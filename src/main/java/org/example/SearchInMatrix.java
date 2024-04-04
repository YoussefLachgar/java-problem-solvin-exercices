package org.example;

import java.util.Scanner;

public class SearchInMatrix {
//    Given two numbers N and M, a 2D array of size N * M and a number X. Determine whether X exists in the 2D array A or not.
//
//    Input
//    First line contains two numbers N, M (2 ≤ N, M ≤ 100) N donates number of rows and M donates number of columns.
//
//    Each of the next N lines will contain M numbers (1 ≤ Ai ≤ 105).
//
//    Last line contains a number X (0 ≤ X ≤ 105) described above.
//
//    Output
//    Print "will take number" if the number doesn't exist in the 2D array otherwise, print "will not take number".

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the array
        System.out.println("Enter the number of rows for the array:");
        int rows = scanner.nextInt();

        // Prompt the user to enter the number of columns for the array
        System.out.println("Enter the number of columns for the array:");
        int columns = scanner.nextInt();

        // Declare a 2D integer array to store the values
        int[][] arr = new int[rows][columns];

        // Loop to get user input for each element of the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Prompt the user to enter the value for array[i][j]
                System.out.printf("Enter the value for array[%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }

        // Prompt the user to enter the number to search for in the array
        System.out.println("Enter the number you want to search for:");
        int searchNumber = scanner.nextInt();

        // Flag to indicate if the number is found
        boolean found = false; // Use a boolean for clarity

        // Loop to search for the number in the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == searchNumber) {
                    found = true;
                    break; // Exit the inner loop if found
                }
            }

            if (found) {
                break; // Exit the outer loop if found
            }
        }

        // Print the result based on the search flag
        if (found) {
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }

        scanner.close(); // Close the Scanner object (good practice)
    }
}
