package com.mahesh.leetcode.array;

import java.util.*;

public class GroupAnagram {
    public static void main(String args[]) {
        String input[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(input));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] hash = new char[26];
            for (char c : str.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}
