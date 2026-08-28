class Solution {
    public int maxProfit(int[] prices) {
        int maxP =0;
        int minbuy =prices[0];

        for(int i : prices){
            maxP = Math.max(maxP,i-minbuy);
            minbuy = Math.min(i,minbuy);
        }
        return maxP;
    }
}
