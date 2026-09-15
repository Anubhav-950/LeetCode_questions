class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int r=ob.length, c=ob[0].length;
        // if(r == 1 && c==1) return 1;

        int dp[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0; j<c;j++)
            {
                if(ob[i][j] == 1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 )
                {
                    if(j>0)
                    dp[i][j]=dp[i][j-1];
                    else
                    dp[i][j]=1;

                    continue;
                }
                else if(j==0 )
                {
                    if(i>0)
                    dp[i][j]=dp[i-1][j];
                    else
                    dp[i][j]=1;

                    continue;
                }

                dp[i][j]=dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[r-1][c-1];

    }
}