package org.leo.algorithm.offer;

/**
 * @ClassName Offer10.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer10 {
    public int fib(int n) {
        int mod = 1000000007;
        if (n < 2) return n;
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % mod;
        }
        return r;
    }
}
