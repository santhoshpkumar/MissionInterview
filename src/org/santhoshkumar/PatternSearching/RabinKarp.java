package org.santhoshkumar.PatternSearching;

/**
 * Created by sk010962 on 10/16/2015.
 */
public class RabinKarp {
    private String pattern;     // the pattern - needed only for Las Vegas not needed to Monte Carlo
    private long patternHash;   // pattern hash value
    private int M;              // pattern length
    private long Q;             // a large prime, small enough to avoid long overflow
    private int R;              // radix
    private long RM;            // R^(M-1) % Q

    public RabinKarp(String pattern) {
        R = 256;
        Q = 997;
    }

    // Compute hash for key[0..M-1].
    private long hash(String key, int M) {
        long h = 0;
        for (int j = 0; j < M; j++) {
            h = (h * R + key.charAt(j)) % Q;
        }
        return h;
    }

    // Las Vegas version: does pat[] match txt[i..i-M+1] ?
    private boolean check(String txt, int i) {
        for (int j = 0; j < M; j++) {
            if (pattern.charAt(j) != txt.charAt(i + j)) {
                return false;
            }
        }
        return true;
    }

    public int search(String txt, String pattern) {
        this.pattern = pattern;      // save pattern (needed only for Las Vegas)
        int N  = txt.length();
        this.M = pattern.length();
        if (N < M) {
            return N;
        }

        // pre-compute R^(M-1) % Q for use in removing leading digit
        RM = 1;
        for (int i = 1; i <= M-1; i++) {
            RM = (R * RM) % Q;
        }

        patternHash = hash(pattern, M);
        long txtHash = hash(txt, M);

        // check for match at offset 0
        if ((patternHash == txtHash) && check(txt, 0))
            return 0;

        // check for hash match; if hash match, check for exact match
        for (int i = M; i < N; i++) {
            // Remove leading digit, add trailing digit, check for match.
            txtHash = (txtHash + Q - RM*txt.charAt(i-M) % Q) % Q;
            txtHash = (txtHash*R + txt.charAt(i)) % Q;

            // match
            int offset = i - M + 1;
            if ((patternHash == txtHash) && check(txt, offset)) {
                return offset;
            }
        }
        // no match
        return N;
    }
}
