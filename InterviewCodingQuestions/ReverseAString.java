package InterviewCodingQuestions;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
