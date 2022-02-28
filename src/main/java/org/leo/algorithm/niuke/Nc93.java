package org.leo.algorithm.niuke;

import java.util.*;

public class Nc93 {

    public static void main(String[] args) {
        Nc93 nc93 = new Nc93();

        int[][] operators = new int[6][3];
        operators[0][0] = 1;
        operators[0][1] = 1;
        operators[0][2] = 1;
        operators[1][0] = 1;
        operators[1][1] = 1;
        operators[1][2] = 2;

        operators[2][0] = 2;
        operators[2][1] = 1;

        int[] lru = nc93.LRU(operators, 3);
        for (int i : lru) {
            System.out.println(i);
        }
    }


    public int[] LRU(int[][] operators, int k) {
        // write code here
        List<Integer> result = new ArrayList<>();
        limit = k;
        for (int i = 0; i < operators.length; i++) {
            if (operators[i][0] == 1) {
                set(operators[i][1], operators[i][2]);
            } else if (operators[i][0] == 2) {
                result.add(get(operators[i][1]));
            }
        }
        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        return ints;
    }


    private LinkedList<Integer> list = new LinkedList<>();
    private Map<Integer, Integer> map = new HashMap<>();
    private int limit;

    public Integer get(Integer key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Integer value = map.get(key);
        list.remove(key);
        list.add(key);
        return value;
    }

    public void set(Integer key, Integer value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            list.remove(key);
            list.add(key);
        } else {
            if (list.size() == limit) {
                Integer integer = list.removeFirst();
                map.remove(integer);
            }
            map.put(key, value);
            list.add(key);
        }
    }

}
