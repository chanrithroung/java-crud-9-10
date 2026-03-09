package org.example.array;


import java.util.Scanner;

public class DemoArray {
    final static int MAX_SIZE = 100;

    public static void menu() {
        System.out.println("==========[ Menu ]=========");
        System.out.println("1. Create");
        System.out.println("2. Display");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("4. Delete");
        System.out.println("5. Sum");
        System.out.println("============================");
    }

    // Create array
    public static void createArray(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Enter value for index(" + i +") : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array created successfully!");
    }


    ///  Display all element in array!
    public static void display(int[] arr, int n) {
        System.out.println("We have " + n + " element in array there are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[MAX_SIZE];
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int option;

        do {
            menu();
            System.out.println("chose one option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 : {
                    System.out.print("How many number do you want ot create : ");
                    n = scanner.nextInt();
                    createArray(arr, n);
                } break;

                case 2 : {
                    display(arr, n);
                } break;
            }

        } while(option != 10);
    }
}
