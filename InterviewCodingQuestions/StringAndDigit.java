package InterviewCodingQuestions;

import java.util.regex.Pattern;

public class StringAndDigit {
    public static void main(String[] args) {
        String input = "a3b12a1";  // Input string

        char currentChar = '\0';  // To store the current character (like 'a' or 'b')
        int count = 0;  // To store the count of repetitions

        // Traverse through the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If the character is a letter (a-z or A-Z)
            if (Character.isLetter(ch)) {
                // If there's a previous character, print it 'count' times
                if (currentChar != '\0') {
                    for (int j = 0; j < count; j++) {
                        System.out.println("hu:"+currentChar);  // Print the character 'count' times
                    }
                }

                // Update the current character and reset the count
                currentChar = ch;
                count = 0;  // Reset the count to 0 for the new character
            }
            // If the character is a digit (0-9)
            else if (Character.isDigit(ch)) {
                // Build the number by appending digits
                count = count * 10 + (ch - '0');
            }
        }

        // After the loop, print the last character 'count' times
        if (currentChar != '\0') {
            for (int i = 0; i < count; i++) {
                System.out.print(currentChar);  // Print the last character
            }
        }
    }
}
