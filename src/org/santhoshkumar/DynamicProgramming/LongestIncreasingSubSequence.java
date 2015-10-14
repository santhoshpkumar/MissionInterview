package org.santhoshkumar.DynamicProgramming;

/**
 * Created by santhoshkumar on 14/10/15.
 */
public class LongestIncreasingSubSequence {
    public int[] input;
    private int[] countHelper;
    int maxCount;

    //Use this is you need to print the sequence
    private int[] seqHelper;
    int maxCountIndex;

    public int find(){
        countHelper = new int[input.length];
        seqHelper = new int[input.length];
        // Each int is longest increasing sequence of length 1
        for(int i = 0 ; i < input.length; i++){
            countHelper[i] = 1;
            seqHelper[i] = 0;
        }
        maxCount = 1;
        maxCountIndex = 0;

        for(int i = 1; i < input.length; i++){
            for(int j = 0; j < i; j++ ){
                if(input[i] > input[j]){
                    //countHelper[i] = Math.max(countHelper[i], countHelper[j]+1);
                    if(countHelper[i] < countHelper[j]+1){
                        countHelper[i] = countHelper[j]+1;
                        seqHelper[i] = j;
                        maxCountIndex = i;
                    }
                    maxCount = Math.max(maxCount, countHelper[i]);
                }
            }
        }
        return maxCount;
    }

    public void print(){
        if(maxCountIndex == 0){
            return;
        }

        int[] result = new int[maxCount];
        int j = maxCount-1;
        int i = maxCountIndex;
        result[j] = input[i];

        while( i > 0 && j < maxCount ){
            i = seqHelper[i];
            j--;
            result[j] = input[i];
        }

        for(int data: result){
            System.out.print(data+" ");
        }
        System.out.println();
    }
}
