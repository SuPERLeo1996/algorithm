package org.leo.algorithm.hot100;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName Leetcode739.java
 * @Author Leo
 * @Description
 * @Date 2021/9/9
 */
public class Leetcode739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                    res[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
