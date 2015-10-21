package org.santhoshkumar;

import org.santhoshkumar.Arrays.*;
import org.santhoshkumar.Backtracking.PrintAllPermutations;
import org.santhoshkumar.DynamicProgramming.*;

import org.santhoshkumar.Encoding.HuffmanCode;
import org.santhoshkumar.Misc.CatalanNumber;
import org.santhoshkumar.Misc.UpperDiagonalMatrixTraverse;
import org.santhoshkumar.Sorting.*;
import org.santhoshkumar.Trees.IsBalanced;
import org.santhoshkumar.Trees.IsBinarySearchTree;

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

        System.out.println("Longest Increasing SubSequence");
        LongestIncreasingSubSequence lcss = new LongestIncreasingSubSequence();
        lcss.input = new int[]{ 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        System.out.print("Given Sequence: ");
        for(int data: lcss.input){
            System.out.print(data+ " ");
        }
        System.out.println();
        System.out.println("Longest SubSequence Length: "+lcss.find());
        lcss.print();

        int[][] a = {   { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
        AllPathsTwoDimArray p = new AllPathsTwoDimArray(a);
        System.out.println("No of Paths By Recursion: "
                + p.countAllRecursion(0, 0));
        System.out.println("No of paths By Dynamic Programming: "
                + p.countAllDynamic(a));
        p.printAllDynamic(0, 0, "");

        System.out.println("Coin Change total ways:");
        CoinChangeTotalWays coinsTotalWaysChange = new CoinChangeTotalWays();
        coinsTotalWaysChange.coins = new int[]{2,3,5};
        System.out.print("Coins: ");
        for(int coin: coinsTotalWaysChange.coins){
            System.out.print(coin+" ");
        }
        System.out.println(" = "+coinsTotalWaysChange.solve(5));

        System.out.println("Coin Change min coins:");
        CoinChangeMinCoins coinsMinChange = new CoinChangeMinCoins();
        coinsMinChange.coins = new int[]{2,3,5};
        System.out.print("Coins: ");
        for(int coin: coinsMinChange.coins){
            System.out.print(coin+" ");
        }
        System.out.println(" = " + coinsMinChange.solve(5));


        String test = "this is an example for huffman encoding";
        // build tree
        HuffmanCode hCode = new HuffmanCode(test);
        hCode.buildTree();
        // print out results
        System.out.println("SYMBOL\tWEIGHT\tHUFFMAN CODE");
        hCode.print();

        UpperDiagonalMatrixTraverse.print();
        CatalanNumber.print();

        MatrixMultiplicationCost mmc = new MatrixMultiplicationCost();
        mmc.cost(new int[]{2, 3, 5, 4, 3});
        mmc.print();

        IsBinarySearchTree bst = new IsBinarySearchTree();
        bst.createTree();
        System.out.println(bst.evaluate());

        IsBalanced isBalanced = new IsBalanced();
        isBalanced.createTree();
        System.out.println(isBalanced.evaluate());
    }
}
