package org.example;


import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        CalcNumbers exercise1 = new CalcNumbers();
        exercise1.suma();
        System.out.println("-------------------------------");

        SmallestNumber exercise2 = new SmallestNumber();
        exercise2.getSmallestNumber();
        System.out.println("-------------------------------");

        MaxDigit exercise3 = new MaxDigit();
        exercise3.getMax();
        System.out.println("-------------------------------");

        PalindromeNumber exercise4 = new PalindromeNumber();
        exercise4.checkPalindrome();
        System.out.println("-------------------------------");

        PrimeNumbers exercise5 = new PrimeNumbers();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number to see all the Prime Numbers below it ");

        exercise5.printPrimeNum(number.nextInt());
    }
}
