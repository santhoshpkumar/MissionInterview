package org.santhoshkumar.Misc;

/**
 * Created by santhoshkumar on 18/10/15.
 */
public class UpperDiagonalMatrixTraverse {

    public void print(){
        int n = 7;

        int[][] matrix = new int[n][n];

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                matrix[i][j] = 0;
            }
        }

        int count = 1;

        for (int i = 1; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                int k = i+j-1;
                //System.out.println(k);
                matrix[j][k] = count;
            }
            count++;
        }

        for(int i=0; i < 7; i++){
            for(int j=0; j < 7; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}


 /* Output:
            1 2 3 4 5 6 7
            0 1 2 3 4 5 6
            0 0 1 2 3 4 5
            0 0 0 1 2 3 4
            0 0 0 0 1 2 3
            0 0 0 0 0 1 2
            0 0 0 0 0 0 1
 */