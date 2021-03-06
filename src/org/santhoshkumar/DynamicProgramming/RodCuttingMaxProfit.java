package org.santhoshkumar.DynamicProgramming;

/**
 * Created by sk010962 on 10/14/2015.
 */
public class RodCuttingMaxProfit {

    int[] cost;

    //Top down DP solution
    public int solve(){
        int[][] matrix = new int[cost.length+1][cost.length+1];

        for(int i= 0; i <= cost.length; i++){
            matrix[i][0] = 0;
            matrix[0][i] = 0;
        }

        //Fill the top row with cost for respective size length cut
        for(int i= 1; i <= cost.length; i++){
            matrix[0][i] = cost[i-1];
        }

        for(int i = 1; i <= cost.length; i++){
            for(int j = 1; j <= cost.length; j++){
                if(i >= j) {
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-i]+cost[i-1]);
                }else{
                    matrix[i][j]= matrix[i-1][j];
                }
            }
        }
        return matrix[cost.length][cost.length];
    }

    // Top down without recursion
    public int solveMax(){
        int[] sol = new int[cost.length+1];
        sol[0] = -1;

        for(int i = 1; i <= cost.length; i++){
            for( int j = i ; j <= cost.length; j++){
                sol[j] = Math.max(sol[j], sol[j-i] + cost[i-1]);
            }
        }
        return sol[cost.length];
    }

    // Top down using recursion
    public int solveMaxRecur(int length){
        if(length <= 0){
            return 0;
        }
        int max = 0;
        for(int i=0; i < length; i++){
            max = Math.max(max, cost[i] + solveMaxRecur(length - i - 1));
        }
        return max;
    }
}
