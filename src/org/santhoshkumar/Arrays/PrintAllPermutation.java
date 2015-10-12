package org.santhoshkumar.Arrays;

/**
 * Created by santhoshkumar on 12/10/15.
 * Print All Permutations of subset of size K from Given Array
 */
public class PrintAllPermutation {
    public void permutation(char[] characters, char[] pattern, int currentCount, int endCount){
        if(currentCount == endCount){
            for(char character: pattern ){
                System.out.print(character);
            }
            System.out.println();
            return;
        }

        for (char character: characters){
            pattern[currentCount] = character;
            permutation(characters, pattern, currentCount+1, endCount);
        }
    }

    public void solve(String input, int count){
        char[] pattern = new char[count];
        permutation(input.toCharArray(),pattern,0,count);
    }
}
