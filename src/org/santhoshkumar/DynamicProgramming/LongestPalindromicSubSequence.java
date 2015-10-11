package org.santhoshkumar.DynamicProgramming;

/**
 * Created by santhoshkumar on 11/10/15.
 */
public class LongestPalindromicSubSequence {

    public int findRecursive(String input){
        //System.out.println(input);
        if(input.length() <= 0){
            return 0;
        }
        if(input.length() == 1){
            return 1;
        }
        if (input.charAt(0) == input.charAt(input.length()-1)){
            return 2+ findRecursive(input.substring(1, input.length() - 1));
        }else{
            int left = findRecursive(input.substring(0, input.length() - 1)) ;
            int right = findRecursive(input.substring(1, input.length()));
            return Math.max(left,right);
        }
    }

    public int findPalindrome(String input){
        int length = input.length();
        int[][] matrix = new int[length][length];

        //Each character is a palindrome of self :)
        for(int i = 0; i < length; i++){
            matrix[i][i] = 1;
        }

        for(int subStrLen = 2; subStrLen <= length; subStrLen++){
            for(int i=0; i <= length-subStrLen; i++){
                int j = i+subStrLen-1;
                if(input.charAt(i)==input.charAt(j) && subStrLen==2){
                    matrix[i][j] = 2;
                }
                else if(input.charAt(i)==input.charAt(j)){
                    matrix[i][j] = matrix[i+1][j-1]+2;
                }
                else{
                    matrix[i][j] = Math.max(matrix[i+1][j],matrix[i][j-1]);
                }
            }
        }
        return matrix[0][length-1];
    }
}
