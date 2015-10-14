package org.santhoshkumar.DynamicProgramming;

/**
 * Created by sk010962 on 10/14/2015.
 */
public class LongestCommonSubString {

    //Bottom up DP approach
    public int solve(String one, String two){
        int rows = one.length()+1;
        int cols = two.length()+1;
        int[][] matrix = new int[rows][cols];
        int max = 0;

        for (int i = 0; i < rows; i++){
            matrix[i][0]= 0;
        }
        for (int i = 0; i < cols; i++){
            matrix[0][i]= 0;
        }

        for (int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++) {
                if(one.charAt(i-1) == two.charAt(j-1)) {
                    matrix[i][j] = 1 + matrix[i-1][j-1];
                    max = Math.max(max, matrix[i][j]);
                }else{
                    matrix[i][j] = 0;
                }
            }
        }
        return max;
    }

    public int solve2(String one, String two){
        return solveRecur(one, two, false);
    }

    // Top Down recursive approach
    private int solveRecur(String strOne, String strTwo, boolean equalCheck){
        if (strOne.length() == 0 || strTwo.length() == 0){
            return 0;
        }

        if(equalCheck){
            if(strOne.charAt(0)== strTwo.charAt(0)){
                return 1+ solveRecur(strOne.substring(1), strTwo.substring(1), true);
            }else{
                return 0;
            }
        }

        int temp = -1;
        if(strOne.charAt(0)== strTwo.charAt(0)){
            temp = 1+ solveRecur(strOne.substring(1), strTwo.substring(1), true);
        }
        return Math.max(temp, Math.max(solveRecur(strOne, strTwo.substring(1),false),solveRecur(strOne.substring(1),strTwo, false)));

    }
}
