package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        String word = input.next();

        System.out.println(word + " has " + countCharacters(word) + " characters.");
    }

    public static int countCharacters(String word) {
        int charCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                charCounter++;
            }
        }

        return charCounter;
    }
}
