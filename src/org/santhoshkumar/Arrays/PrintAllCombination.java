package org.santhoshkumar.Arrays;

/**
 * Created by santhoshkumar on 12/10/15.
 * Print All Combinations of subset of size K from Given Array
 */
public class PrintAllCombination {

    public void combination(char[] input, boolean[] helper, int startIndex, int currentLength, int endCount){
        if( currentLength == endCount ){
            // print the combination
            for(int i = 0; i < input.length; i++){
                if(helper[i] == true){
                    System.out.print(input[i]);
                }
            }
            System.out.println();
            return;
        }
        if(startIndex == input.length){
            return;
        }
        helper[startIndex] = true;
        combination(input,helper,startIndex+1, currentLength+1, endCount);
        helper[startIndex] = false;
        combination(input,helper,startIndex+1, currentLength, endCount);
    }

    public void solve(String input, int count){
        if(count > input.length()){
            // We cannot generate a combination greater than the length of given string
            return;
        }
        boolean[] helper = new boolean[input.length()];
        combination(input.toCharArray(),helper, 0, 0, count);
    }
}
