package Janurary;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] arg){
        int number, count=0;

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i=2;i<=Math.sqrt(number); i++) {
            if(number%i==0){
                count++;
                break;
            }

        }
        if(count ==0)
            System.out.println("Is prime number");
        else
            System.out.println("Not Prime");
    }

}
