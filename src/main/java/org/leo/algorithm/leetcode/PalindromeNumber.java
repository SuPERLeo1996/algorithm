package org.leo.algorithm.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if( x < 0) {
            return false;
        }

        String s = String.valueOf(x);
        int l = 0;
        int r = s.length() - 1;
        while(l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r++;
        }

        return true;

    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        palindromeNumber.isPalindrome(121);
    }
}