package org.example;


public class PrimeNumbers {

    static boolean isPrimeNum(int n) {

        if(n <= 1){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }  return true;

    }

    public void printPrimeNum(int n){

        for (int i = 2; i < n; i++) {
            if (isPrimeNum(i)){
                System.out.println(i + " ");
            }
        }
    }
}