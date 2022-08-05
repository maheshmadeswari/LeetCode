package com.mahesh.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String args[]) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram1(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        for (char key : t.toCharArray()) {
            if (sMap.containsKey(key)) {
                int count = sMap.get(key);
                if (count == 1) {
                    sMap.remove(key);
                } else if (count > 0) {
                    sMap.put(key, count - 1);
                }
            } else {
                return false;
            }
        }
        return sMap.isEmpty();
    }

    private static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for (int i = 0; i < s.length(); i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }

}
