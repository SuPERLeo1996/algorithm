package org.leo.algorithm.offer;

import java.util.Stack;

/**
 * @ClassName Offer30.java
 * @Author Leo
 * @Description
 * @Date 2021/8/30
 */
public class Offer30 {
    class MinStack {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        /** initialize your data structure here. */
        public MinStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
            if (stack2.isEmpty()) {
                stack2.push(x);
            } else {
                if (stack2.peek() > x) {
                    stack2.push(x);
                } else {
                    stack2.push(stack2.peek());
                }
            }

        }

        public void pop() {
            stack1.pop();
            stack2.pop();
        }

        public int top() {
            return stack1.peek();

        }

        public int min() {
            return stack2.peek();
        }
    }
}
