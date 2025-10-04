package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstUniqueWord {
    public static void main(String[] args) {

        // Write a program that reads a line of text from the user (for example, a sentence).
        // Then find and print the first word that appears only once.

        Scanner scanner = new Scanner(System.in);

        // ask the user for a sentence
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // split the sentence into words using space as a separator
        String[] words = sentence.split(" ");

        // create a HashMap to count how many times each word appears
        Map<String, Integer> wordCount = new HashMap<>();

        // first loop: count the occurrences of each word

        for (String word : words) {
            // if the word is already in the map, increase its count by 1
            // otherwise, put it in the map with count 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // second loop: find the first word that appears only once
        String firstUniqueWord = null;
        for (String word : words) {
            if (wordCount.get(word) == 1) {
                firstUniqueWord = word;
                break; // stop as soon as we find the first unique word
            }
        }

        // output the result
        if (firstUniqueWord != null) {
            System.out.println("The first unique word is: " + firstUniqueWord);
        } else {
            System.out.println("The are no unique words in the sentence.");
        }


    }
}
