package org.santhoshkumar.Sorting;

/**
 * Created by sk010962 on 10/13/2015.
 */
public class HeapSort {
    public int[] input;

    private void heapify(int index, int end){
        int left  = 2*index+1;
        int right = 2*index+2;
        int largest  = index;

        if ( left < end && input[left] > input[index]){
            largest = left;
        }
        if ( right < end && input[right] > input[largest]){
            largest = right;
        }
        if (largest != index){
            swap(index, largest);
            heapify(largest,end);
        }
    }

    private void swap(int from, int to){
        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;
    }

    public void sort(){
        for(int i=input.length/2; i >= 0; i--){
            heapify(i, input.length-1);
        }
        for(int i =input.length-1; i > 0; i--){
            swap(0,i);
            heapify(0,i-1);
        }
    }

    public void print(){
        for(int data: input){
            System.out.print(data);
        }
        System.out.println();
    }
}
