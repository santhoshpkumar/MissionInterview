package org.santhoshkumar.Sorting;

/**
 * Created by sk010962 on 10/13/2015.
 *
 * Time Complexity:

     Recurrence relation based on the code

     - the for loop stops when the indexes cross, hence there are N iterations
     - swap is one operation – disregarded
     Two recursive calls:
        Best case: each call is on half the array, hence time is 2T(N/2)
        Worst case: one array is empty, the other is N-1 elements, hence time is T(N-1)

 */


public class QuickSort {
    public int[] input;

    public void sort(){
        doQuickSort(0, input.length-1);
    }

    private void doQuickSort(int startIndex, int endIndex){
        int pivot = input[startIndex+(endIndex-startIndex)/2];

        int i = startIndex;
        int j = endIndex;

        while(i <= j){
            while(input[i] < pivot){
                i++;
            }
            while(input[j] > pivot){
                j--;
            }
            if (i <= j){
                swap(i,j);
                i++;
                j--;
            }
        }
        // By this time i and j would have crossed over the pivot
        if (i < endIndex){
            doQuickSort(i, endIndex);
        }
        if (startIndex < j){
            doQuickSort(startIndex, j);
        }
    }

    private void swap(int from, int to){
        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;
    }

    public void print(){
        for(int data: input){
            System.out.print(data);
        }
        System.out.println();
    }
}
