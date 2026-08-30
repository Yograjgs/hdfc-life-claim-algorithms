package com.hdfclife.algo;

public class PalindromeChecker {

    public static boolean isPalindrome(int number){
        char digits[]=String.valueOf(number).toCharArray();

        int left=0;
        int right=digits.length-1;


        while(left<right){
            if(digits[left]!=digits[right]){
                return false;

            }

            left++;
            right--;
        }
        return true;
    }
}
