package org.leo.algorithm.offer;

/**
 * @ClassName Offer10II.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer10II {
    public int numWays(int n) {
        int mod = 1000000007;
        int a = 1,b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a+b) % mod;
            a = b;
            b = sum;
        }
        return a;
    }
}
