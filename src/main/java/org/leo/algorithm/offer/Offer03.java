package org.leo.algorithm.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Offer03.java
 * @Author Leo
 * @Description
 * @Date 2021/9/2
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }
}
