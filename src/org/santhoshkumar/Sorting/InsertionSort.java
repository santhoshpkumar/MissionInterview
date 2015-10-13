package org.santhoshkumar.Sorting;

/**
 * Created by sk010962 on 10/13/2015.
 */
public class InsertionSort {
    public int[] input;
    public void sort(){
        for(int i = 1; i < input.length; i++){
            int j = i;
            int item = input[j];
            for(; j > 0 && input[j-1] > item; j--){
                input[j] = input[j-1];
            }
            input[j] = item;
        }
    }

    public void print(){
        for(int data: input){
            System.out.print(data);
        }
        System.out.println();
    }
}
