package org.santhoshkumar.PatternSearching;

/**
 * Created by sk010962 on 10/16/2015.
 *
 * Constraint: Brute-force algorithm needs backup for every mismatch.
 * Solution: 1. Use pattern size buffer buffer for backup
 *           2. Use better algorithm
 *
 *
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
        return -1; // Pattern not found
    }

    // Alternate explicit backup
    public int find2(String givenString, String pattern) {
        int i, strLength = givenString.length();
        int j, patLength = pattern.length();

        for (i = 0, j = 0; i < strLength && j < patLength; i++, j++) {
            if (givenString.charAt(i + j) != pattern.charAt(j)) {
                break;
            } else {
                i -= j; // backup i to matched so far
                j = 0; // reset j = zero
            }
        }
        if (j == patLength) {
            return i;
        }
        return -1; // Pattern not found
    }
}
