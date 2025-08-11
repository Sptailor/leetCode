// LeetCode: Best Time to Buy and Sell Stock
// This solution tracks the lowest stock price seen so far (minPrice) while iterating through the array.
// At each price, it calculates the potential profit if sold today and updates maxProfit if this profit is higher.
// Time Complexity: O(n) – single pass through the array.
// Space Complexity: O(1) – only a few variables are used.



class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int potentialProfit=0;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }

            potentialProfit=prices[i]-minPrice;

            if(potentialProfit>maxProfit){

                maxProfit=potentialProfit;
             }
        }
        return maxProfit;
    }
}