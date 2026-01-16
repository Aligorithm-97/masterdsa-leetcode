package twopointers.leetcode167_twosumtwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwo {

    public int[] twoSumHashMap(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            int tmp = target - numbers[i];
            if (mp.containsKey(tmp)){
                return new int[]{mp.get(tmp), i + 1};
            }
            mp.put(numbers[i], i + 1);
        }
        return new  int[0];
    }

    public int[] twoSumTwoPointers(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r){
            int curSum = numbers[l] + numbers[r];
            if (curSum > target){
                r--;
            }else if (curSum < target){
                l++;
            }else{
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[0];
    }


    public static void main(String[] args) {

        TwoSumTwo twoSumTwo = new TwoSumTwo();
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumTwo.twoSumHashMap(numbers, target)));
        System.out.println(Arrays.toString(twoSumTwo.twoSumTwoPointers(numbers, target)));

    }
}
