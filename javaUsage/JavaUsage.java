package javaUsage;

import java.util.*;

public class JavaUsage {

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

    public static void main(String[] args) {
        // Array
        int[] numS = {1,2,3,4};
        int[] numY = {2,3,4};
        Arrays.sort(numS);
        System.out.println(Arrays.toString(numS));
        System.out.println(numS.length);
        Arrays.stream(numS).forEach(System.out::println);
        var x = Arrays.stream(numS).distinct().count();

        Arrays.equals(numS,numY);

        int[] numT = new int[26];

        // Set

        Set<Integer> setT = new HashSet<>();
        setT.add(1);
        setT.add(2);
        var t = setT.size();
        System.out.println(t);
        System.out.println(setT.contains(1));

        // String



        String a = "a";
        String b = "b";

        char[] sSort = a.toCharArray();


        if (a.equals(b)){
            System.out.println(a);
        }

        if (a.length() == b.length()){
            System.out.println("Equal size");
        }

        // Loops

        for (int num : numS){
            System.out.println(num);
        }

        // HashMap

        HashMap<Character,Integer> mapP = new HashMap<>();
        HashMap<Character,Integer> mapL = new HashMap<>();

        for (int i = 0; i <a.length() ; i++) {
            mapP.put(a.charAt(i),mapP.getOrDefault(a.charAt(i),0)+1);
        }

        mapP.equals(mapL);

        Map<String,List<String>> res = new HashMap<>();

        res.putIfAbsent("sortedS",new ArrayList<>());
        res.get("sortedS").add("s");
        // Two Pointer

        JavaUsage javaUsage = new JavaUsage();
        int[] nums = {4,5,6};
        int target = 10;
        System.out.println(Arrays.toString(javaUsage.twoSumTwoPointers(nums, target)));

    }
}
