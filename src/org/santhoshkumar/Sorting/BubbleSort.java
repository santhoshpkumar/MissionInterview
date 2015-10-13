package org.santhoshkumar.Sorting;

/**
 * Created by sk010962 on 10/13/2015.
 */
public class BubbleSort {
    public int[] input;

    public void sort(){
        for(int i = 0; i < input.length-1; i++){
            for(int j = input.length-1; j > i ; j--){
                if(input[j] < input[j-1] ){
                    int temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
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
