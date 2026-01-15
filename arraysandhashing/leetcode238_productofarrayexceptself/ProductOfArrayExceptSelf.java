package arraysandhashing.leetcode238_productofarrayexceptself;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelfDiv(int[] nums) {
        int prod=1,zeroCount=0;
        for (int num:nums) {
            if (num != 0) prod *= num;
            else zeroCount++;
        }
        if (zeroCount>1) return new int[nums.length];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(zeroCount>0){
                res[i]=(nums[i]==0)?prod:0;
            }else{
                res[i]=prod/nums[i];
            }
        }
        return res;
    }

    public int[] productExceptSelfPrefixSuffix(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for (int i=n-1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }

        public static void main(String[] args) {

            ProductOfArrayExceptSelf pa = new ProductOfArrayExceptSelf();

            int[] a = pa.productExceptSelfDiv(new int[]{1,2,4,6});
            int[] b = pa.productExceptSelfPrefixSuffix(new int[]{1,2,4,6});

            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(a));
    }
}
