package leetcode128_longestconsecutivesequence;

import java.util.HashSet;
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

    public static void main(String[] args) {
        LongestConsecutiveSequence l = new LongestConsecutiveSequence();
        System.out.println(l.longestConsecutiveHashSet(new int[]{2,20,4,10,3,4,5}));
    }
}
