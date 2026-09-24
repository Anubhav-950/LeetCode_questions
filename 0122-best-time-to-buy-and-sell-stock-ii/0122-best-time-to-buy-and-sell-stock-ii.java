class Solution {
    public int maxProfit(int[] p) {
        int n=p.length, min=0;
        int dp[]=new int[n];
        dp[0]=0;

        for(int i=1;i<n;i++)
        {
            int profit=p[i]-p[i-1];
            if(profit < 0)
            dp[i]=dp[i-1];
            
            else dp[i]=dp[i-1]+profit;


        }
        return dp[n-1];
    }
}