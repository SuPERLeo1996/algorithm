package org.leo.algorithm;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName LongestValidParenthesesDemo.java
 * @Author gonglinjie
 * @Description 32. 最长有效括号
 * @Date 2021/3/23
 */
public class LongestValidParenthesesDemo {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int max = 0;
        for (int i = 0;i < s.length();i++) {
            if(s.charAt(i)=='(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max,i - stack.peek());
                }
            }
        }

        return max;
    }
}
