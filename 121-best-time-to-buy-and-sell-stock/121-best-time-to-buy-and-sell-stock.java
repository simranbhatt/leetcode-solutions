class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int currentProf = 0;
        int maxProf = 0;
        for(int price : prices) {
            //is today's price less than the minimum price we've seen so far?
            if(price < min) {
                min = price;
            }
            //what is the profit if we sell at today's price assuming we bought at min?
            currentProf = price - min;
            //
            //if current profit is higher, mark that as the max profit
            if(currentProf > maxProf) {
                maxProf = currentProf;
            }
        }
        return maxProf;
    }
}