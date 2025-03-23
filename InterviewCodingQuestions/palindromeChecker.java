package InterviewCodingQuestions;

import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] arg) {
        String name, reverseName = "";
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("String name: " + name);
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }
        if (reverseName.equals(name)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
