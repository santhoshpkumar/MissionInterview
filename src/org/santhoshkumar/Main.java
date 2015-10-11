package org.santhoshkumar;

import org.santhoshkumar.DynamicProgramming.LongestCommonSubSequence;
import org.santhoshkumar.DynamicProgramming.LongestPalindromicSubSequence;

public class Main {

    public static void main(String[] args) {
        LongestPalindromicSubSequence lonPalindrome = new LongestPalindromicSubSequence();
        System.out.println(lonPalindrome.findRecursive(new String("AABCDEBAZ")));
        System.out.println(lonPalindrome.findPalindrome(new String("AABCDEBAZ")));

        LongestCommonSubSequence lonComSeq = new LongestCommonSubSequence();
        System.out.println(lonComSeq.findRecursive(new String("ABCD"), new String("ACD")));
        System.out.println(lonComSeq.findLongest(new String("ABCD"), new String("AD")));
    }
}
