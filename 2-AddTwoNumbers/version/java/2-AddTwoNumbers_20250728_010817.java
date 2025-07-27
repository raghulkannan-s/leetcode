// Last updated: 7/28/2025, 1:08:17 AM
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int mp = 0;
        
        for( int i = 0; i < prices.length; i++){
            
            int curr = prices[i];
            int cp = curr - min;

            if( cp > mp ){
                mp = cp;
            }
            if( curr < min ){
                min = curr;
            }
        }
        return mp;
    }
}