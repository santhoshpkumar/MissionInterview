package org.santhoshkumar.DynamicProgramming;

/**
 * Created by santhoshkumar on 11/10/15.
 */
public class LongestCommonSubSequence {

    public int findRecursive(String one, String two){
        if(one.length()==0 || two.length()==0){
            return 0;
        }

        if(one.charAt(0)==two.charAt(0)){
            return 1+findRecursive(one.substring(1),two.substring(1));
        }else{
            return Math.max(findRecursive(one,two.substring(1)), findRecursive(one.substring(1),two));
        }
    }

    public int findLongest(String one, String two){
        int[][] matrix = new int[one.length()+1][two.length()+1];

        int oneLength = one.length();
        int twoLength = two.length();

        for(int i = 0; i <= oneLength; i++){
            matrix[i][0]=0;
        }
        for(int i = 0; i <= twoLength; i++){
            matrix[0][i]=0;
        }

        for(int i =1; i <=oneLength; i++){
            for(int j =1; j <=twoLength; j++){
                if(one.charAt(i-1)==two.charAt(j-1)){
                    matrix[i][j]=1+matrix[i-1][j-1];
                }else{
                    matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
                }
            }
        }
        return matrix[oneLength][twoLength];
    }
}
