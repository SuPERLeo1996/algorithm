package org.leo.algorithm.offer;

import org.leo.algorithm.assist.ListNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName Offer06.java
 * @Author Leo
 * @Description
 * @Date 2021/8/31
 */
public class Offer06 {


    public int[] reversePrint(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }
        int size = stack.size();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = stack.pop().val;
        }
        return array;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);

        Offer06 offer06 = new Offer06();
        Arrays.stream(offer06.reversePrint(head)).forEach(System.out::println);
    }

}
