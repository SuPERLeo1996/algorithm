package org.leo.algorithm.assist;

/**
 * @ClassName Node.java
 * @Author Leo
 * @Description
 * @Date 2021/8/31
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}