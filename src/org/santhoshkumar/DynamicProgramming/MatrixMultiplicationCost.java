package org.santhoshkumar.DynamicProgramming;

/**
 * Created by santhoshkumar on 18/10/15.
 */
public class MatrixMultiplicationCost {
    int[][] matrix;
    int n;

    public int cost(int[] arr){

        n = arr.length;
        matrix = new int[n][n];

        for (int l = 2 ; l < n; l++){
            for(int i = 0; i < n-l; i++){
                int j = i+l;
                matrix[i][j]= Integer.MAX_VALUE;
                for(int k = i+1; k < j; k++){
                    matrix[i][j]= Math.min(
                            matrix[i][j],
                            matrix[i][k]+matrix[k][j]+(arr[i]*arr[k]*arr[j]));
                }
            }
        }
        return matrix[0][arr.length-1];
    }

    public void print(){
        System.out.println("\nMatrix Multiplication Cost");
        for(int i=0; i < n; i ++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    System.out.print("00 ");
                }else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
