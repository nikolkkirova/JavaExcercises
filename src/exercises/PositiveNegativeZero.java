package exercises;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = scanner.nextInt();
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num < 0) {
                counterNegative++;
            } else if (num == 0) {
                counterZero++;
            } else {
                counterPositive++;
            }
        }

        System.out.println("The number of positive numbers is: " + counterPositive);
        System.out.println("The number of negative numbers is: " + counterNegative);
        System.out.println("The number of zero numbers is: " + counterZero);
    }
}
