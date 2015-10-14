package org.santhoshkumar.DynamicProgramming;

/**
 * Created by sk010962 on 10/14/2015.
 * Given an array arr[0 … n-1] containing n positive integers, a sub-sequence of arr[] is called Bitonic if it is first increasing, then decreasing.
 */

public class LongestBitonicSequence {
    public int[] input;

    public int solve(){
        int[] left = new int[input.length];
        int[] right = new int[input.length];
        int[] result = new int[input.length];

        for(int i = 0 ; i < input.length; i++){
            left[i] = 1;
            right[i] = 1;
        }

        for(int i = 1; i < input.length ; i++){
            for (int j = 0 ; j < i ; j++){
                if(input[i] > input[j] ) {
                    left[i] = Math.max(left[i], 1 + left[j]);
                }
            }
        }

        for(int i = input.length-2; i >= 0 ; i--){
            for (int j = input.length-1 ; j > i ; j--){
                if(input[i] > input[j] ) {
                    right[i] = Math.max(right[i], 1 + right[j]);
                }
            }
        }

        int max = 0;
        for(int i=0; i < input.length; i++){
            if(max < left[i] + right[i]-1){
                max = left[i] + right[i] -1;
            }
        }
        return max;
    }
}
