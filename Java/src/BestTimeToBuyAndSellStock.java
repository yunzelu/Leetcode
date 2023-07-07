public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length < 1) {
            return 0;
        }

        // pointers
        int first = 0;
        int move = 0;
        while (move < prices.length-1) {
            move++;
            if (prices[move] < prices[first]) {
                first = move;
                continue;
            }
            profit = Math.max(profit, prices[move] - prices[first]);
        }

        return profit;
    }
}
