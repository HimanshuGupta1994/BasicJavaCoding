package InterviewCodingQuestions;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] arg){
        // 2,3,5,7
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for (int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not a prime number");
        }
    }
}
