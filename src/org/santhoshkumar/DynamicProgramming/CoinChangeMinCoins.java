package org.santhoshkumar.DynamicProgramming;

/**
 * Created by sk010962 on 10/14/2015.
 *  * Objective: Given a set of coins and amount, Write an algorithm to find out how minimum no of coins required to make change for the given amount.

 Example:
 Amount = 5
 coins [] = {1,2,3}
 {1,1,1,1,1} {1,1,1,2}, {1,2,2}, {1,1,3} {2,3}
 Min coins = 2
 */

public class CoinChangeMinCoins {
    public int[] coins;

    public int solve(int changeFor){
        int rows = coins.length+1;
        int cols = changeFor+1;
        int[][] matrix = new int[rows][cols];

        for(int i=0; i < rows; i++){
            matrix[i][0] = 0;
        }
        // set the min value to default high value, to take care of rounding when +1 taking max-2
        for(int i=0; i < cols; i++){
            matrix[0][i] = Integer.MAX_VALUE-2;
        }

        for(int i=1; i < rows; i++){
            for(int j=1; j < cols; j++){
                if(j >= coins[i-1]){
                    matrix[i][j] = Math.min(matrix[i-1][j],1+matrix[i][j-coins[i-1]]);
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        return matrix[rows-1][cols-1];
    }
}
