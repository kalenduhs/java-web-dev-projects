package org.launchcode;

import java.util.Scanner;
public class aliceAdventures {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("Give me a word, see if you're lucky.");
        String word = input.nextLine();

        System.out.println("Your guess was " + sentence.contains(word.toLowerCase()));

    }
}
