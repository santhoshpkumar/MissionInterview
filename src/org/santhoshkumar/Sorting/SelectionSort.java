package org.santhoshkumar.Sorting;

/**
 * Created by sk010962 on 10/13/2015.
 */
public class SelectionSort {
    public int[] input;

    public void sort(){
        for(int i = 0; i < input.length-1; i++){
            for(int j = i+1; j < input.length; j++ ){
                if(input[i] > input[j]){
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
    }

    public void print(){
        for(int data: input){
            System.out.print(data);
        }
        System.out.println();
    }
}
