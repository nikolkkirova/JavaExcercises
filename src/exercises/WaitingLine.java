package exercises;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class WaitingLine {
    public static void main(String[] args) {
        // write a program that simulates people waiting in a queue

        // data structure: queue
        // works as First In, First Out (FIFO) — what goes in first, comes out first
		// think of it like a line of people waiting — first person in line is served first

        Scanner scanner = new Scanner(System.in);

        // create a queue to hold names (people)
        Queue<String> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Add person");
            System.out.println("2. Serve person");
            System.out.println("3. Show next person");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear leftover newline

            if (choice == 1) {
                // add person
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                queue.add(name);
                System.out.println(name + " joined the line.");
            } else if (choice == 2) {
                // serve (remove the first person)
                if (queue.isEmpty()) {
                    System.out.println("No one is in line");
                } else {
                    String served = queue.poll(); // removes the first person
                    System.out.println(served + " was served.");
                }
            } else if (choice == 3) {
                // show who is next
                if (queue.isEmpty()) {
                    System.out.println("No one is in line");
                } else {
                    System.out.println("Next person: " + queue.peek()); // look at the first person
                }
            } else if (choice == 4) {
                // exit the program
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
