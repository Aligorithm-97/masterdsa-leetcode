package binarysearch.leetcode704_binarysearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;

        while (l<=r){
            int mid = l+((r-l)/2);
            if(nums[mid]>target){
                r=mid-1;
            } else if(nums[mid]<target){
                l=mid+1;
            }  else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        System.out.println(bs.search(new int[]{-1,0,2,4,6,8}, 4));
    }
}
