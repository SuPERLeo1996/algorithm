package org.leo.algorithm.hot100;

import org.leo.algorithm.assist.ListNode;

public class Leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int capiticy = 0;
        ListNode head = new ListNode(0);
        ListNode prev = head;
        while (l1 != null || l2 != null) {
            int one = l1 != null ? l1.val : 0;
            int two = l2 != null ? l2.val : 0;
            int sum = one + two + capiticy;
            capiticy = sum / 10;
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (capiticy > 0) {
            prev.next = new ListNode(capiticy);
        }
        return head.next;
    }
}
