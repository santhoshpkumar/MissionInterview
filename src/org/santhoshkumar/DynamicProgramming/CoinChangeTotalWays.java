package org.santhoshkumar.DynamicProgramming;

/**
 * Created by sk010962 on 10/14/2015.
 * Objective: Given a set of coins and amount, Write an algorithm to find out how many ways we can make the change of the amount using the coins given.

 This is another problem in which i will show you the advantage of Dynamic programming over recursion.
 Example:
 Amount = 5
 coins [] = {1,2,3}
 {1,1,1,1,1} {1,1,1,2}, {1,2,2}, {1,1,3} {2,3}
 Number of ways to make change = 5
 */

public class CoinChangeTotalWays {
    public int[] coins;
    public int solve(int count){
        int rows = coins.length+1;
        int cols = count+1;
        int[][] matrix = new int[rows][cols];

        // we can make 1 way of coin count 0 with 0 coin, that is empty set
        for(int i=0; i < rows; i++){
            matrix[i][0] = 1;
        }
        // We can make 0 ways with 0 coins
        for(int i=0; i < cols; i++){
            matrix[0][i] = 0;
        }

        for(int i=1; i < rows; i++){
            for(int j=1; j < cols; j++){
                if( j >= coins[i-1]){
                    matrix[i][j] = matrix[i-1][j]+matrix[i][j-coins[i-1]];
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
        return matrix[rows-1][cols-1];
    }
}
