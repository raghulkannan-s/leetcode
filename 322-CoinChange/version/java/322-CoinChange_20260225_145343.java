// Last updated: 2/25/2026, 2:53:43 PM
class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int p:coins)
        {
            for(int j=p;j<=amount;j++)
            {
                dp[j]=Math.min(dp[j],1+dp[j-p]);
            }

            
        }
        return dp[amount]>amount ? -1 :dp[amount];

    }
}