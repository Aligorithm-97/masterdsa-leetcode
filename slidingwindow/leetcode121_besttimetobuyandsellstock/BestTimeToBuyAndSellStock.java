package slidingwindow.leetcode121_besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStock {

    public int maxProfitTwoPointers(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bt = new BestTimeToBuyAndSellStock();
        System.out.println(bt.maxProfitTwoPointers(new int[]{10,1,5,6,7,1}));
    }
}
