package leetcode128_longestconsecutivesequence;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutiveHashSet(int[] nums) {
            Set<Integer> numSet = new HashSet<>();
            for (int num : nums) {
                numSet.add(num);
            }
            int longest = 0;

            for (int num : numSet) {
                if (!numSet.contains(num - 1)) {
                    int length = 1;
                    while (numSet.contains(num + length)) {
                        length++;
                    }
                    longest = Math.max(longest, length);
                }
            }
            return longest;
    }

    public int longestConsecutiveHashMap(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                res = Math.max(res, mp.get(num));
            }
        }
        return res;
    }

        public static void main(String[] args) {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();

            System.out.println(l.longestConsecutiveHashSet(new int[]{2,20,4,10,3,4,5}));
            System.out.println(l.longestConsecutiveHashMap(new int[]{2,20,4,10,3,4,5}));
    }
}
