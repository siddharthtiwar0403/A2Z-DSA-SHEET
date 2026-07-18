class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                int Profit = prices[i] - minPrice;
                maxProfit = Math.max(Profit, maxProfit);
            }
        }
        return maxProfit;
    }
}