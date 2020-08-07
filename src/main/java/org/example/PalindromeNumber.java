package org.example;

import java.util.Scanner;

public class PalindromeNumber {
     void checkPalindrome() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome number");

        int n = number.nextInt();
        int sum = 0, r;
        int temp = n; // temp = temporary number

        while (n > 0) {
            r = n%10;
            sum = (sum*10) + r;
            n=n/10;
        }
        if(temp == sum){
            System.out.println("This number is palindrome");
        }else
            System.out.println(("This is not a palindrome number"));
    }
}
