package org.leo.algorithm.offer;

import org.leo.algorithm.assist.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Offer35.java
 * @Author Leo
 * @Description
 * @Date 2021/8/31
 */
public class Offer35 {
    Map<Node,Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        if (!map.containsKey(head)) {
            Node newNode = new Node(head.val);
            map.put(head,newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return map.get(head);
    }

    public Node copyRandomList1(Node head) {
        if (head == null) {
            return null;
        }
        for(Node node = head;node != null; node = node.next.next) {
            Node nodeNew = new Node(node.val);
            nodeNew.next = node.next;
            node.next = nodeNew;
        }

        for (Node node = head;node != null; node = node.next.next) {
            Node nodeNew = node.next;
            nodeNew.random = (node.random != null ? node.random.next : null);
        }
        Node headNew = head.next;
        for (Node node = head; node != null; node = node.next) {
            Node nodeNew = node.next;
            node.next = node.next.next;
            nodeNew.next = (nodeNew.next != null) ? nodeNew.next.next : null;
        }
        return headNew;
    }
}
