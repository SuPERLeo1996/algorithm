package org.leo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName DailyTemperatures.java
 * @Author Leo
 * @Description
 * @Date 2021/8/30
 */
public class DailyTemperatures {


    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                res[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] t = {30,40,50,60};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] arrays = dailyTemperatures.dailyTemperatures(t);
        Arrays.stream(arrays).forEach(System.out::println);
    }
}
