package com.mycompany.app;

import java.util.Arrays;

public class StringEasy {
    public void run() {

    }
    public String addStrings(String num1, String num2) {
        int i = num1.length();
        int j = num2.length();
        int c = 0;
        String res = "";

        while (i >= 0 || j >= 0 || c != 0) {
            int ival = i >= 0 ? num1.charAt(i) : 0;
            int jval = j >= 0 ? num2.charAt(j) : 0;

            int t = ival + jval + c;
            res = (t % 10) + res;
            c = t / 10;
        }

        return res;

    }

    public static String longestCommonPrefix(String[] strs) {

        String res = strs[0];

        Arrays.sort(strs);
        int c = 0;

        while (c < strs[0].length()) {
            if (strs[0].charAt(c) == strs[strs.length - 1].charAt(c)) {
                ++c;
            } else {
                break;
            }
        }
        for (String x : strs)
            System.out.println(x);
        return strs[0].substring(0, c);

    }

    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                ++i;
                --j;
            } else {
                return checkPalinrome(s, i + 1, j) || checkPalinrome(s, i, j - 1);
            }
        }

        return checkPalinrome(s, i, j);
    }

    private boolean checkPalinrome(String s, int i, int j) {
        // TODO Auto-generated method stub
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                ++i;
                --j;
            } else {
                return false;
            }
        }
        return true;
    }
}
