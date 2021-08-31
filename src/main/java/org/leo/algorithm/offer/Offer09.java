package org.leo.algorithm.offer;

import java.util.Stack;

/**
 * @ClassName Offer09.java
 * @Author Leo
 * @Description
 * @Date 2021/8/30
 */
public class Offer09 {


    class CQueue {
        private Stack<Integer> in;
        private Stack<Integer> out;

        public CQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        public void appendTail(int value) {
            in.push(value);
        }

        public int deleteHead() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
            if (out.isEmpty()) {
                return -1;
            } else {
                return out.pop();
            }
        }
    }
}
