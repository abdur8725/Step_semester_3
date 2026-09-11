package practiceProblem;

public class BestTimeToBuyAndSellStock {
    /**
     * L2. Best Time to Buy and Sell Stock
     * Walk through the array once, keeping track of the lowest price seen so far.
     * Calculate profit if sold today: today's price minus lowest price seen so far.
     * Return maximum profit found, or 0 if no profit is possible.
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
