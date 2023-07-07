import java.util.ArrayList;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;

        ArrayList<Integer> cliffPoints = new ArrayList<>();
        if (prices.length < 1) {
            return profit;
        }

        cliffPoints.add(0);
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                continue;
            }
            cliffPoints.add(i);
        }

        for (int i = 0; i < cliffPoints.size() - 1; i++) {
            profit += prices[cliffPoints.get(i+1)-1] - prices[cliffPoints.get(i)];
        }
        profit += prices[prices.length-1] - prices[cliffPoints.get(cliffPoints.size()-1)];

        return profit;
    }
}
