class Solution {
    public int maxProfit(int[] prices) {
    
    int n = prices.length;
    int maxProfit = Integer.MIN_VALUE;
    int min = prices[0];

    for(int i=0 ; i< n ; i++){
        int profit =0;
        if(prices[i] < min){
            min = prices[i];
        }
        profit = prices[i] - min;
        if(profit > maxProfit){
            maxProfit = profit;
        }
    }

    return maxProfit;
}
}