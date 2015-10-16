package org.santhoshkumar.PatternSearching;

/**
 * Created by sk010962 on 10/16/2015.
 *
 * Note: Brute-force algorithm needs backup for every mismatch.
 *
 */
public class BruteForce {
    public int find(String givenString, String pattern){
        int strLength = givenString.length();
        int patLength = pattern.length();

        for(int i =0; i < strLength; i++){
            int j = 0;
            for(; j < patLength; j++){
                if(givenString.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j == patLength){
                return i;
            }
        }
        return -1;
    }
}
