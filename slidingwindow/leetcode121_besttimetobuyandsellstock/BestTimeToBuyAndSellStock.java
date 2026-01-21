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

    public int maxProfitDP(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];
        for (int sell: prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bt = new BestTimeToBuyAndSellStock();
        System.out.println(bt.maxProfitTwoPointers(new int[]{10,1,5,6,8,1}));
        System.out.println(bt.maxProfitDP(new int[]{10,1,5,6,8,1}));
    }
}
