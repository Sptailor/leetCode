
//by Suhail Tailor
// LeetCode: Best Time to Buy and Sell Stock
// This solution tracks the lowest stock price seen so far (minPrice) while iterating through the array.
// At each price, it calculates the potential profit if sold today and updates maxProfit if this profit is higher.
// Time Complexity: O(n) – single pass through the array.
// Space Complexity: O(1) – only a few variables are used.



class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];// Initialize minPrice to the first price
        int potentialProfit=0;// Variable to track potential profit
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){// Iterate through each price in the array
            if(minPrice>prices[i]){// Update minPrice if the current price is lower
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