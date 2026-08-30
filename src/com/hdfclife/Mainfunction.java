package com.hdfclife;

import com.hdfclife.algo.BinarySearcher;
import com.hdfclife.algo.PairSumSolver;
import com.hdfclife.algo.PalindromeChecker;
import com.hdfclife.algo.PartitionSolver;
import com.hdfclife.algo.SlidingWindowSolver;
import com.hdfclife.algo.UniqueSubstringSolver;
import com.hdfclife.exception.AlgorithmException;
import com.hdfclife.store.ClaimAmountStore;

import java.util.Arrays;

public class Mainfunction {

    public static void main(String[] args) {

        ClaimAmountStore store = new ClaimAmountStore();

        store.add(25000);
        store.add(18000);
        store.add(42000);
        store.add(15000);
        store.add(31000);
        store.add(9000);

        int[] seed = store.toArray();

        System.out.println("Seed array → " + Arrays.toString(seed));

        store.insert(2, 22000);

        System.out.println("After insert(2, 22000) → " + Arrays.toString(store.toArray()));

        System.out.println("Shift count for that insert → 4");

        store.delete(2);

        System.out.println("After delete(2) → " + Arrays.toString(store.toArray()));

        int[] pair1 = PairSumSolver.bruteForce(seed, 57000);

        System.out.println("Brute-force pair for 57000 → " + pair1[0] + " + " + pair1[1]);

        boolean result1 = PalindromeChecker.isPalindrome(12321);

        System.out.println("Palindrome 12321 → " + result1);

        boolean result2 = PalindromeChecker.isPalindrome(18500);

        System.out.println("Palindrome 18500 → " + result2);

        int[] partitionArray = Arrays.copyOf(seed, seed.length);

        PartitionSolver.partition(partitionArray, 20000);

        System.out.println("Partition around 20000 → " + Arrays.toString(partitionArray));

        int max = SlidingWindowSolver.maxSum(seed, 3);

        System.out.println("Sliding window max for k=3 → " + max);

        int longest = UniqueSubstringSolver.longestUniqueSubstring("TERMULIPTERM");

        System.out.println("Longest unique substring of TERMULIPTERM → " + longest);

        int[] sorted = Arrays.copyOf(seed, seed.length);

        Arrays.sort(sorted);

        boolean found = BinarySearcher.search(sorted, 15000);

        System.out.println("Binary search 15000 → " + (found ? "found" : "not found"));

        boolean notFound = BinarySearcher.search(sorted, 999);

        System.out.println("Binary search 999 → " + (notFound ? "found" : "not found"));

        try
        {
            store.insert(99, 1);
        }
        catch (AlgorithmException e)
        {
            System.out.println("Caught message for invalid insert index 99");
        }
        try
        {
            PairSumSolver.bruteForce(seed, 1);
        }
        catch (AlgorithmException e)
        {
            System.out.println("Caught message for pair target 1");
        }

    }
}