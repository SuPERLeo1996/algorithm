package org.leo.algorithm.hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Leetcode3.java
 * @Author Leo
 * @Description
 * @Date 2021/9/14
 */
public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int ans = 0;
        int rk = -1;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i< length; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }

            while (rk + 1 < length && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans,rk - i + 1);
        }
        return ans;
    }
}
