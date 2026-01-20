package binarysearch.leetcode875_kokoeatingbananas;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        KokoEatingBananas koko = new KokoEatingBananas();
        System.out.println(koko.minEatingSpeed(new int[] {1,4,3,2}, 9));
    }
}
