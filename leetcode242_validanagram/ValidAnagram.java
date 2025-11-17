package leetcode242_validanagram;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagramSort(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }

    public boolean isAnagramHashMap(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        for (int i=0;i<s.length();i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0)+1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0)+1);
        }
        return countS.equals(countT);
    }

    public boolean isAnagramHashTable(String s,String t){
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i=0;i<s.length();i++){
            count[s.charAt(i - 'a')]++;
            count[t.charAt(i - 'a')]--;
        }
        for (int val:count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        var a = validAnagram.isAnagramSort("racecar", "carrace");
        var b = validAnagram.isAnagramSort("jar", "jam");
        var c = validAnagram.isAnagramHashMap("racecar", "carrace");
        var d = validAnagram.isAnagramHashMap("jar", "jam");
        var e = validAnagram.isAnagramHashMap("racecar", "carrace");
        var f = validAnagram.isAnagramHashMap("jar", "jam");
        System.out.println(a +" "+ b + " Time Complexity : O(nlogn + mlogm) - Space Complexity : O(1) or O(n + m) depends -> (sorting algorithm type)");
        System.out.println(c +" "+ d + " Time Complexity : O(n + m) - Space Complexity : O(1) since we have at most 26 different characters");
        System.out.println(e +" "+ f + " Time Complexity : O(n + m) - Space Complexity : O(1) since we have at most 26 different characters");
    }
}
