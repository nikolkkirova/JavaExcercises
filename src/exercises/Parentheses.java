package exercises;

import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        // Write a program that checks whether a string has balanced parentheses — that is, every opening bracket
        // ( has a matching closing bracket ) in the correct order.

        // data structure used: Stack — it follows the rule Last In, First Out (LIFO)
       // You “push” when you see ( and “pop” when you see )

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression: ");
        String expression = scanner.nextLine();

        // create a stack to hold parentheses
        Stack<Character> stack = new Stack<>();

        // go through each character in the string
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i); // get the character at position i int the string expression

            // if it's an opening parenthesis, push it to the stack
            if (ch == '(') {
                stack.push(ch);

            }
            // if it's a closing parenthesis
            else if (ch == ')') {
                if (stack.isEmpty()) { // if the stack is empty, it means there is no matching '('
                    System.out.println("Not balanced");
                    return; // stop the program
                }
                // otherwise, pop one '(' from the stack
                stack.pop();
            }
        }

        // if the stack is empty at the end --> balanced
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}

/*
example

((a+b)*(c-d))

Step 1:
( → push
Stack: (

Step 2:
Another ( → push
Stack: ( (

Step 3:
) → pop
Stack: (

Step 4:
Another ) → pop
Stack: (empty)

empty at the end --> balanced :)

*/