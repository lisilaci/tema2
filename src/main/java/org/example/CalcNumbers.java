package org.example;


public class CalcNumbers {
    static int sum = 0;
    static int i = 0;

     void suma(){

        for(i=1; i<=100;i++){
            sum += i;
        }
        System.out.println("The sum of the first 100 numbers higher than 0 is " + sum);
    }
}

