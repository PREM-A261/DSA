public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i= 0; i<prices.length; i++){
            if(min > prices[i] ){
                min = prices[i];
            }
            int diff = prices[i] - min;
            profit = Math.max(profit, diff);
        }
        return profit;
    }
public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock solution = new Best_Time_to_Buy_and_Sell_Stock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit); // Output: Maximum Profit: 5
    }
}