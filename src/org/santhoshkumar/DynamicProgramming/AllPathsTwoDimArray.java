package org.santhoshkumar.DynamicProgramming;

/**
 * Created by santhoshkumar on 14/10/15.
 */

public class AllPathsTwoDimArray {

    int rowCount;
    int colCount;
    int[][] matrix;

    public AllPathsTwoDimArray(int matrix[][]) {
        this.matrix = matrix;
        rowCount = matrix.length;
        colCount = matrix[0].length;
    }

    //Recursion approach without memorization
    public int countAllRecursion(int currentRow, int currentColumn) {
        if (currentRow == rowCount - 1) {
            return 1;
        }
        if (currentColumn == colCount - 1) {
            return 1;
        }
        return countAllRecursion(currentRow + 1, currentColumn)
                + countAllRecursion(currentRow, currentColumn + 1)
                + countAllRecursion(currentRow + 1, currentColumn + 1);
    }

    // Bottom up dynamic programming approach
    public int countAllDynamic(int[][] arrA) {
        int[][] resultCount = new int[arrA.length][arrA[0].length];
        for (int i = 0; i < arrA.length; i++) {
            resultCount[i][0] = 1;
        }
        for (int i = 0; i < arrA[1].length; i++) {
            resultCount[0][i] = 1;
        }

        for (int i = 1; i < arrA.length; i++) {
            for (int j = 1; j < arrA[1].length; j++) {
                resultCount[i][j] = resultCount[i][j - 1]
                        + resultCount[i - 1][j] + resultCount[i - 1][j - 1];
            }
        }
        return resultCount[arrA.length - 1][arrA[0].length - 1];
    }

    public void printAllDynamic(int currentRow, int currentColumn, String path) {
        if (currentRow == rowCount - 1) {
            for (int i = currentColumn; i < colCount; i++) {
                path += "-" + matrix[currentRow][i];
            }
            System.out.println(path);
            return;
        }
        if (currentColumn == colCount - 1) {
            for (int i = currentRow; i <= rowCount - 1; i++) {
                path += "-" + matrix[i][currentColumn];
            }
            System.out.println(path);
            return;
        }
        path = path + "-" + matrix[currentRow][currentColumn];
        printAllDynamic(currentRow + 1, currentColumn, path);
        printAllDynamic(currentRow, currentColumn + 1, path);
        printAllDynamic(currentRow + 1, currentColumn + 1, path);
    }

}
