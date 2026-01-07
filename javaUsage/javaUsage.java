package javaUsage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class javaUsage {

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

    }
}
