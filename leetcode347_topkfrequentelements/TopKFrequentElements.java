package leetcode347_topkfrequentelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequentSorting(int[] nums , int k){
        Map<Integer,Integer> count = new HashMap<>();
        for (int num:nums){
            count.put(num,count.getOrDefault(num,0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:count.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int[] res = new int[k];
        for (int i=0;i<k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] ints = topKFrequentElements.topKFrequentSorting(nums, k);
        System.out.println(ints[0] + " " + ints[1]);

    }
}
