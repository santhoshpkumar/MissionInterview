package org.santhoshkumar.PatternSearching;

/**
 * Created by sk010962 on 10/16/2015.
 */
public class KnuthMorrisPratt {
    int[] dfa;

    //Build the lsp (longest proper prefix which is also suffix) array which will be our -> Deterministic Finite State Automaton (DFA)
    public void preProcess(String pattern) {
        dfa = new int[pattern.length()];
        dfa[0] = 0;
        int j = 0;
        for (int i = 1; i < pattern.length(); ) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                dfa[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = dfa[j - 1];
                } else {
                    dfa[i] = 0;
                    i++;
                }
            }
        }
    }

    public boolean find(String givenString, String pattern) {
        preProcess(pattern);
        int i = 0, j = 0;
        while (i < givenString.length() && j < pattern.length()) {
            if (givenString.charAt(i) == pattern.charAt(j)) {
                j++;
                i++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = dfa[j - 1];
                }
            }
        }
        return (j == pattern.length());
    }
}
