package org.santhoshkumar.Arrays;

/**
 * Created by santhoshkumar on 12/10/15.
 * Print All the Subsets of a Given Set (Power Set)
 */
public class SuperSet {
    public void solve(String input){
        PrintAllCombination combinations = new PrintAllCombination();
        for(int i=0; i <= input.length(); i++){
            combinations.solve(input,i);
        }
    }
}
