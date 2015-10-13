package org.santhoshkumar;

import org.santhoshkumar.Arrays.*;
import org.santhoshkumar.Backtracking.PrintAllPermutations;
import org.santhoshkumar.DynamicProgramming.LongestCommonSubSequence;
import org.santhoshkumar.DynamicProgramming.LongestPalindromicSubSequence;

import org.santhoshkumar.Sorting.*;

public class Main {

    public static void main(String[] args) {
        LongestPalindromicSubSequence lonPalindrome = new LongestPalindromicSubSequence();
        System.out.println(lonPalindrome.findRecursive(new String("AABCDEBAZ")));
        System.out.println(lonPalindrome.findPalindrome(new String("AABCDEBAZ")));

        LongestCommonSubSequence lonComSeq = new LongestCommonSubSequence();
        System.out.println(lonComSeq.findRecursive(new String("ABCD"), new String("ACD")));
        System.out.println(lonComSeq.findLongest(new String("ABCD"), new String("AD")));

        System.out.println("Combinations");
        PrintAllCombination printCombinations = new PrintAllCombination();
        printCombinations.solve(new String("ABCD"), 2);

        System.out.println("Permutations");
        PrintAllPermutation printPermutations = new PrintAllPermutation();
        printPermutations.solve(new String("ABCD"), 2);

        System.out.println("Super Set");
        SuperSet superset = new SuperSet();
        superset.solve(new String("ABCD"));

        //Sorting
        System.out.println("Bubble Sort");
        BubbleSort bs = new BubbleSort();
        bs.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        bs.sort();
        bs.print();

        System.out.println("Selection Sort");
        SelectionSort ss = new SelectionSort();
        ss.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        ss.sort();
        ss.print();

        System.out.println("Insertion Sort");
        InsertionSort is = new InsertionSort();
        is.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        is.sort();
        is.print();

        System.out.println("Heap Sort");
        HeapSort hs = new HeapSort();
        hs.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        hs.sort();
        hs.print();

        System.out.println("Merge Sort");
        MergeSort ms = new MergeSort();
        ms.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        ms.sort();
        ms.print();

        System.out.println("Quick Sort");
        QuickSort qs = new QuickSort();
        qs.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        qs.sort();
        qs.print();

        System.out.println("Backtracking: Print all permutations");
        PrintAllPermutations permute = new PrintAllPermutations();
        permute.print(new String("BT"));

        System.out.println("Is String Palindrome");
        WordIsPalindrome isWordPalindrome = new WordIsPalindrome();
        System.out.println(isWordPalindrome.check(new String("SANAS")));
        System.out.println(isWordPalindrome.check(new String("SANA")));

        System.out.println("Are Strings Anagrams");
        WordsAreAngrams areWordAnagrams = new WordsAreAngrams();
        System.out.println(areWordAnagrams.check("SANAS", "SABNS"));
        System.out.println(areWordAnagrams.check("SANAS", "SAANS"));
    }
}
