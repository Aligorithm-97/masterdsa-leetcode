package arraysandhashing.leetcode1_twosum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSumTwoPointers(int[] nums,int target){
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]),Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];

    }
    public int[] twoSumHashMap(int[] nums,int target){
        HashMap<Integer,Integer> prevMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff),i};
            }
            prevMap.put(num,i);
        }
        return new int[]{};
    }



    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {4,5,6};
        int target = 10;
        var res = twoSum.twoSumTwoPointers(nums, target);
        var result = twoSum.twoSumHashMap(nums, target);
        System.out.println(res[0] + " " + res[1] + " Time Complexity : O(nlogn) - Space Complexity : O(n)");
        System.out.println(result[0] + " " + result[1]+ " Time Complexity : O(n) - Space Complexity : O(n)");
    }
}
