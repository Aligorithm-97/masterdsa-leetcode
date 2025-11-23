package leetcode49_groupanagrams;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagramsSorting(String[] str){
        Map<String,List<String>> res = new HashMap<>();
        for(String s : str){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS,new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public List<List<String>> groupAnagramsHashTable(String[] str){
        Map<String,List<String>> res = new HashMap<>();
        for(String s:str){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }


    public static void main(String[] args) {
        String[] str = {"act", "pots", "tops", "cat", "stop", "hat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lists = groupAnagrams.groupAnagramsSorting(str);
        List<List<String>> listsHash = groupAnagrams.groupAnagramsHashTable(str);
        System.out.println(lists + " Time Complexity : O(m∗nlogn) - Space Complexity : O(m∗n)");
        System.out.println(listsHash + " Time Complexity : O(m∗n) - Space Complexity : O(m) extra space and O(m∗n) space for the output list");
    }
}
