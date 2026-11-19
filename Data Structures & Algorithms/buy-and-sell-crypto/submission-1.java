class Solution {
    public int maxProfit(int[] prices) {
        int greatestProfit = 0;
        if (prices.length < 2){
            return greatestProfit;
        }
        int L = 0;
        int R = 1;
        while (R < prices.length){
            if (prices[L] >= prices[R]){
                L = R;
                R++;
            } else {
                if (prices[R] - prices[L] > greatestProfit){
                    greatestProfit = prices[R] - prices[L];
                }
                R++;
            }
        }
        return greatestProfit;
    }
}
