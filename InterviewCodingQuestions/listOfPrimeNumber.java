package InterviewCodingQuestions;

import java.util.Scanner;

public class listOfPrimeNumber {
    public static boolean getPrimeNumber(int number) {
        int count = 0;
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        return count == 0;
    }

    public static void main(String[] arg) {
        int a, b;
        System.out.println("Enter two number for list:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("List of prime number:");
        for (int i = a; i < b; i++) {
            boolean getStatus = getPrimeNumber(i);
            if (getStatus) {
                System.out.println(i);
            }
        }
    }
}
