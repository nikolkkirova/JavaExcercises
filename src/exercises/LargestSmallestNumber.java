package exercises;

import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        // Find the Largest and Smallest Number

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num = scanner.nextInt();

        int[] numbers = new int[num];

        System.out.println("Enter the numbers: ");

        // read the first number
        numbers[0] = scanner.nextInt();
        int min = numbers[0];
        int max = numbers[0];

        // read the remaining numbers and update min, max
        for (int i = 1; i < num; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
