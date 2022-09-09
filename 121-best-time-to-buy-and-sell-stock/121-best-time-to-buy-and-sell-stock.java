class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int currentProf = 0;
        int maxProf = 0;
        for(int price : prices) {
            if(price < min) {
                min = price;
            }
            currentProf = price - min;
            if(currentProf > maxProf) {
                maxProf = currentProf;
            }
        }
        return maxProf;
    }
}