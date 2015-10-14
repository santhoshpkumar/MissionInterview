package org.santhoshkumar.Sorting;

/**
 * Created by sk010962 on 10/13/2015.
 *
 * Time Complexity
 *
     time to mergesort N elements = time to mergesort N/2 elements plus
                                    time to merge two arrays each N/2 elements.

     Time to merge two arrays each N/2 elements is linear, i.e. N
     Each partition splits the array into half, i.e log N
 */

public class MergeSort {
    public int[] input;
    public int[] mergeHelper;

    public void sort(){
        mergeHelper = new int[input.length];
        mergeSort(0,input.length-1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            mergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int low, int mid, int high){
        for(int i = low; i <= high; i++ ){
            mergeHelper[i] = input[i];
        }

        int left = low;
        int right =  mid+1;
        int index = low;
        while (left <= mid && right <= high ){
            if(mergeHelper[left] < mergeHelper[right]){
                input[index] = mergeHelper[left];
                left++;
            }else{
                input[index] = mergeHelper[right];
                right++;
            }
            index++;
        }
        while (left<=mid){
            input[index] = mergeHelper[left];
            index++;
            left++;
        }
        while (right<=high){
            input[index] = mergeHelper[right];
            index++;
            right++;
        }
    }

    public void print(){
        for(int data: input){
            System.out.print(data);
        }
        System.out.println();
    }
}
