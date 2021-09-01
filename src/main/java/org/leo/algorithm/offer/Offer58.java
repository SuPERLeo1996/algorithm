package org.leo.algorithm.offer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName Offer58.java
 * @Author Leo
 * @Description
 * @Date 2021/9/1
 */
public class Offer58 {

    public String reverseLeftWords(String s, int n) {
        String result = "";
        for (int i = n; i < s.length(); i ++) {
            result += s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            result += s.charAt(i);
        }

        return result;
    }

}
