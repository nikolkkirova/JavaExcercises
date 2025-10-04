package exercises;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        // write a program that reads N numbers (entered by the user) and prints the sum of all even numbers among them

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int num = scanner.nextInt(); // read how many numbers the user wants to input

        int sumEvenNumbers = 0; // a variable to hold the sum

        System.out.println("Enter the numbers: ");
        int[] numbers = new int[num]; // create an array with 'num' elements
        for (int i = 0; i < num; i++) { // loop over each index
            numbers[i] = scanner.nextInt(); // read number
            if (numbers[i] % 2 == 0) { // check if the number is even
                sumEvenNumbers = sumEvenNumbers + numbers[i]; // add it to the sum
            }
        }

        System.out.println("The sum of the even numbers from the array is: " + sumEvenNumbers);
    }
}
