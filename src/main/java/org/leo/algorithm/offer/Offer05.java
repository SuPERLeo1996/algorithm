package org.leo.algorithm.offer;

/**
 * @ClassName Offer05.java
 * @Author Leo
 * @Description
 * @Date 2021/9/1
 */
public class Offer05 {

    public String replaceSpace(String s) {
        char[] chars = new char[s.length() * 3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                chars[index++] = '%';
                chars[index++] = '2';
                chars[index++] = '0';
            } else {
                chars[index++] = s.charAt(i);
            }
        }
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < index; i++) {
            r.append(chars[i]);
        }
        return r.toString();

    }

}
