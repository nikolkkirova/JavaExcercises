package exercises;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user how many numbers he wants to input
        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n]; // create an array of size n

        // read the numbers from the user
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // ask the user to enter the number to search for
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        // linear search algorithm
        boolean found = false; // a flag to check if we found the number
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) { // check each element
                System.out.println("Number found at index " + i);
                found = true;
                break; // stop searching once found
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}
