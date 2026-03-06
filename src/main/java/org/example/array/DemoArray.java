package org.example.array;

import java.util.Scanner;

public class DemoArray {
    // create array
    // find min, max.
    // add
    // sort
    // delete
    // search
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter n : ");
        int n = scanner.nextInt();

        createArray(arr, n, scanner);
        displayElementArray(arr, n);
    }

    ///  create n element in array!
    public static void createArray(int[] arr, int n, Scanner scanner) {
        for(int i = 0; i < n; i++) {
            System.out.print("Enter value for index(" + i +") : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("The process input value is completed!");
    }

    ///  This method used for output element in array!
    public static void displayElementArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
