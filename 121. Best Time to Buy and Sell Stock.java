class Solution {
    public int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int profit = 0;
        int past = 0;
        for(int i =0;i< prices.length;i++){
            if(prices[i]< min){
                min= prices[i];
            }
            past = prices[i]- min;
            if(past>profit){
                profit =past;
            }
        
        }return profit;
    }
}
