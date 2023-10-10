//  121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {

        int lowestPrice = prices[0];
        int currentProfit = 0;
        int highestProfit = 0;

        for(int index=1 ; index<prices.length ; index++) {
            
            if(prices[index] < lowestPrice) {
                lowestPrice = prices[index];
            }            
            
            currentProfit = prices[index] - lowestPrice;

            if(currentProfit > highestProfit) {
                highestProfit = currentProfit;
            }
        }

        return highestProfit;
    }
}