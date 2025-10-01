class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }

    // method must be static since main is static
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max_profit = 0;
        int buy_price = prices[0];

        for (int i = 1; i < n; i++) {   // loop starts from 1
            int curr_profit = prices[i] - buy_price;

            if (curr_profit > max_profit) {
                max_profit = curr_profit;
            }

            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
        }

        return max_profit;  // return the best profit
    }
}
