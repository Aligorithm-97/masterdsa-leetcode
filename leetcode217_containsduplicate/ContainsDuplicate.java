package leetcode217_containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate{

    public boolean hasDuplicateBruteForce(int[] nums){
        for (int i=0;i<nums.length;i++){
            for (int j = i + 1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDuplicateHashSet(int[] nums) {
        Set<Integer> sett = new HashSet<>();
        for (int num : nums){
            if (sett.contains(num)){
                return true;
            }
            sett.add(num);
        }
        return false;
    }

    public boolean hasDuplicateSolution(int[] nums) {
        Set<Integer> setS = new HashSet<>();
        for (int num : nums) {
            setS.add(num);
        }
        return setS.size() < nums.length;
    }

    public boolean hasDuplicateHashSetLength(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,4};
        boolean resultBruteForce = containsDuplicate.hasDuplicateBruteForce(nums);
        boolean resultSort = containsDuplicate.hasDuplicateSort(nums);
        boolean result = containsDuplicate.hasDuplicateHashSet(nums);
        boolean resultHashSetLength = containsDuplicate.hasDuplicateHashSetLength(nums);
        boolean res = containsDuplicate.hasDuplicateSolution(nums);
        System.out.println(resultBruteForce + " Time Complexity : O(n²) - Space Complexity : O(1)"); 
        System.out.println(resultSort  + " Time Complexity : O(nlogn) - Space Complexity : O(1) or O(n) depends (sorting algorithm type)"); 
        System.out.println(result + " Time Complexity : O(n) - Space Complexity : O(n)");
        System.out.println(resultHashSetLength + " Time Complexity : O(n) - Space Complexity : O(n)");
        System.out.println(res + " Time Complexity : 0(n) - Space Complexity : O(n)");
    }
}