/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 02 - Counting the Number of Characters
 */

package org.example;
import java.util.Scanner;

public class App 
{
    // Main function
    public static void main( String[] args )
    {
        // Prompt for user input and store in input
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        // I'm sure I didn't have to store inside a String value, but
        // I did anyways since I thought it would be easier
        String word = input.next();

        // Call for countCharacters function within print statement
        System.out.println(word + " has " + countCharacters(word) + " characters.");
    }

    // Returns int value of how many characters are in the string
    public static int countCharacters(String word) {
        int charCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            charCounter++;
        }

        return charCounter;
    }
}
