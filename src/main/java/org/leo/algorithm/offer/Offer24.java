package org.leo.algorithm.offer;

import org.leo.algorithm.assist.ListNode;

import java.util.Arrays;

/**
 * @ClassName Offer24.java
 * @Author Leo
 * @Description
 * @Date 2021/8/31
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Offer24 offer24 = new Offer24();
        ListNode listNode = offer24.reverseList(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


}
