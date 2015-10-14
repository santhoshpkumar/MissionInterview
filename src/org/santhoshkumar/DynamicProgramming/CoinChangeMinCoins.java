package org.santhoshkumar.DynamicProgramming;

/**
 * Created by sk010962 on 10/14/2015.
 * Objective: Given a set of coins and amount, Write an algorithm to find out how minimum no of coins required to make change for the given amount.

 Example:
 Amount = 5
 coins [] = {1,2,3}
 {1,1,1,1,1} {1,1,1,2}, {1,2,2}, {1,1,3} {2,3}
 Min coins = 2
 */

public class CoinChangeMinCoins {
    public int[] coins;

    //DP bottom up solution
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


    //Recursive top down solution
    public int solveMin(int j)
    {
        int[] sol;
        sol = new int[coins.length];

       /* ---------------------------
          Base cases
          --------------------------- */
        if ( j == 0 )
        {
            return(0);
        }

       /* ==================================================
          Initialize sol[]
	      ================================================== */
        for ( int k = 0; k < coins.length; k++ )
            sol[k] = -1;                   // -1 means: no solution

       /* --------------------------------------------------------
          Try every denomination k = 1,2,..,C for the last coin
          -------------------------------------------------------- */
        for ( int k = 0; k < coins.length; k++ )
        {
          /* --------------------------------------------
             Check if we can use the k-th denomination
             -------------------------------------------- */
            if ( coins[k] <= j )
            {
             /* ------------------------
                Divide step
                ------------------------ */
                // Use coin v[k] as last coin
                sol[k] = solveMin(j - coins[k]) + 1;    // Solution to make change for $j
            }
        }

       /* --------------------------------------------------------
          Find the minimum for ALL mySol[...] values
	      Note: -1 means do NOT use !
          -------------------------------------------------------- */
        int finalSol = -1;
        for ( int k = 0; k < coins.length; k++ )
        {
            if ( sol[k] >= 0 /* Don't use -1 values */ )
            {
                if ( finalSol == -1 || sol[k] < finalSol )
                    finalSol = sol[k];
            }
        }
        return(finalSol);   // Return best solution
    }
}
