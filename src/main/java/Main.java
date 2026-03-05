import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("========[Crud App]==========");
        System.out.println("1.Create Array");
        System.out.println("2.Read Array");
        System.out.println("3.Update Array");
        System.out.println("4.Delete Array");
        System.out.println("5.Search Element in array!");
        System.out.println("6.Sum all element in array");
        System.out.println("7.Find Minimum and Maximum number in array!");
        System.out.println("============================");
    }

    // check choice is valid
    public static boolean validChoice(int choice) {
        return choice <= 7 && choice >= 1;
    }

    // check index is valid
    public static boolean isValidN(int n) {
        return n >= 1 && n <= 30;
    }


    // Search for find element exist in array!
    /// Search index used for find index of element in array if found return that index otherwise return -1
    public static int searchIndex(int[] arr,int searchValue, int n) {
        int index = -1;
        // 10, 20, 30, 40, 50
        for(int i = 0 ; i < n; i++) {
            if(arr[i] == searchValue) {
                index = i;
                break;
            }
        }
        return index;
    }


    /// Empty array alert method
    public static void emptyArrayAlert() {
        System.out.println("Array is empty! please create element it that array first");
    }
    /// <h1>Array!</h1>
    public static void main(String[] args) {
        ///  crud
        // crate, read, update, delete
        Scanner scanner = new Scanner(System.in);
        int []numbers = new int[30];
        int choice;
        int n = 0;

        do {
            menu();
            // validate user input for choose the choice
            do {
                System.out.print("Please enter your choice : ");
                choice = scanner.nextInt();
                if (!validChoice(choice)) {
                    System.out.println("Invalid choice!");
                }
            } while(!validChoice(choice));
            //.....

            switch (choice) {
                case 1 -> {
                    do {
                        System.out.print("How many number do you want to create? : ");
                        n = scanner.nextInt();
                        if(!isValidN(n)) {
                            System.out.println("The minimum value of n is 1 and maximum is 30. ensure you are entered a correct value");
                        }
                    } while (!isValidN(n));

                    System.out.println("Enter " + n + " values for array of number: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value for index("+i+") : ");
                        numbers[i] = scanner.nextInt();
                    }

                }
                case 2 -> {
                    if(n == 0) {
                        emptyArrayAlert();
                    } else {
                        System.out.println("You have " + n + " element in array, here are: ");
                        for(int i = 0 ; i < n; i++) {
                            System.out.print(numbers[i] + ",");
                        }
                        System.out.println("\b");
                    }
                }


                case 3 -> {
                    if(n == 0) {
                        emptyArrayAlert();
                    } else {
                        System.out.print("Enter value in array that you want to update : ");
                        int searchValue = scanner.nextInt();
                        int index = searchIndex(numbers, searchValue, n);

                        if(index == -1) {
                            System.out.println("Not found " + searchValue + " in any index of array!");
                        } else {
                            System.out.print("Please enter a new value for index("+index+") : ");
                            numbers[index] = scanner.nextInt();
                        }
                    }
                }

                case 4 -> {
                    if(n == 0) {
                        emptyArrayAlert();
                    } else  {
                        System.out.print("Enter a value that you want to delete from this array: ");
                        int searchValue = scanner.nextInt();
                        int index = searchIndex(numbers, searchValue, n);
                        if(index == -1) {
                            System.out.println("This value " + searchValue + " can't be found in this array!");
                        } else {
                            for(int i = index; i < n; i++) {
                                numbers[i] = numbers[i+1];
                            }
                            n--;
                        }
                    }
                }

                case 5 -> {
                    if(n == 0) {
                        emptyArrayAlert();
                    } else {
                        System.out.print("Enter value that you want to search in array: ");
                        int searchValue = scanner.nextInt();
                        int index = searchIndex(numbers, searchValue, n);
                        if(index != -1) {
                            System.out.println("Foud " + numbers[index] + " in index " + index);
                        } else {
                            System.out.println("Not found " + searchValue + " in any index of array!");
                        }
                    }
                }

                case 6 -> {
                    int sum = 0;
                    for(int i = 0; i < n; i++) {
                        System.out.print(numbers[i] + " + ");
                        sum += numbers[i];
                    }
                    System.out.println("\b\b = " + sum);
                }

                case 7 -> {
                    if(n == 0) {
                        emptyArrayAlert();
                    } else {
                        int min;
                        int max;
                        min = max = numbers[0];

                        // 20, 40, 60, 10, 70
                        // min = numbers[0];
                        for(int i = 1; i < n; i++) {
                            if(numbers[i] < min) min = numbers[i];
                            if(numbers[i] > max) max = numbers[i];
                        }
                        System.out.println("The Minimum number is " + min + "\nThe Maximum number is " + max);
                    }
                }
            }
        } while(choice != 10);
    }
}
