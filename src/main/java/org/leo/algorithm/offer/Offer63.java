package org.leo.algorithm.offer;

/**
 * @ClassName Offer63.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer63 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else if (prices[i] - prices[i - 1] > maxProfit){
                maxProfit = prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
