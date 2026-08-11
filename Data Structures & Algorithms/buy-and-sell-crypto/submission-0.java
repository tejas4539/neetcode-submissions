class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            int get=prices[i]-min;
            if(get>profit){
                profit=get;
            }
        }
        return profit;

    }
}
