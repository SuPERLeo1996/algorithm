package org.leo.algorithm.hot100;

/**
 * @ClassName Leetcode647.java
 * @Author Leo
 * @Description
 * @Date 2021/9/9
 */
public class Leetcode647Fail {
    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;
    }
}
