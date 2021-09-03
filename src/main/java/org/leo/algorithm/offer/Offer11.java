package org.leo.algorithm.offer;

/**
 * @ClassName Offer11.java
 * @Author Leo
 * @Description
 * @Date 2021/9/3
 */
public class Offer11 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int p = left + (right - left) / 2;
            if (numbers[p] < numbers[right]) {
                right = p;
            } else if (numbers[p] > numbers[right]) {
                left = p + 1;
            } else {
                right -= 1;
            }
        }
        return numbers[left];
    }
}
