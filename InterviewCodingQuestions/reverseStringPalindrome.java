package InterviewCodingQuestions;

public class reverseStringPalindrome {
    public static void main(String[] arg) {
        String str = "madam", rever = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rever = rever + str.charAt(i);
        }
        System.out.println("String is Palindrome :" + str.matches(rever));
    }
}
