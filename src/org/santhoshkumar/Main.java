package org.santhoshkumar;

import org.santhoshkumar.DynamicProgramming.LongestPalindromicSubSequence;

public class Main {

    public static void main(String[] args) {
        LongestPalindromicSubSequence lonPalindrome = new LongestPalindromicSubSequence();
        System.out.println(lonPalindrome.findRecursive(new String("AABCDEBAZ")));
        System.out.println(lonPalindrome.findPalindrome(new String("AABCDEBAZ")));
    }
}
