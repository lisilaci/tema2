package org.example;


import java.util.Scanner;

public class MaxDigit {

     void getMax() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number to get the max digit");

        int n = number.nextInt();
        int m = n;
        int max = 0; // int min = 9;
        int r; //rest -> modulo

        while (m!=0){
            r = m % 10;
            if (r>max){
                max = r;
            }
            // if (r<min){ min = r; } ==>> for min value
            m = m/10;
        }
        System.out.println( "Max digit in Number " + n + " is: " + max );
    }
}

