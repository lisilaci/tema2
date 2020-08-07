package org.example;


public class SmallestNumber {

    static int[] array = new int[] {42, 16, 22, 7, 35, 51};
    static int minimum = array[0];
    static int i;

     void getSmallestNumber(){

        for(i=0; i<array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }
        System.out.println("Smallest element in the array is: " + minimum);
    }
}