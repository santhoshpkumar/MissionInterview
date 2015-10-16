package org.santhoshkumar.PatternSearching;

/**
 * Created by sk010962 on 10/16/2015.
 */
public class KnuthMorrisPratt {
    int[] nfa;

    //Build the lsp (longest proper prefix which is also suffix) array which will be our -> Non-Deterministic Finite State Automaton
    public void preProcess(String pattern) {
        nfa = new int[pattern.length()];
        nfa[0] = 0;
        int j = 0;
        for (int i = 1; i < pattern.length(); ) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                nfa[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = nfa[j - 1];
                } else {
                    nfa[i] = 0;
                    i++;
                }
            }
        }
    }

    public boolean search(String givenString, String pattern) {
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
                    j = nfa[j - 1];
                }
            }
        }
        return (j == pattern.length());
    }
}
