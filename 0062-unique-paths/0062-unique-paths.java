class Solution {
    
    public int uniquePaths(int m, int n) {
        //if(m == 1&& n==1) return 1;
        int cnt[][]=new int [m][n];
        for(int i=0; i< m; i++)
        {
            for(int j=0; j<n;j++)
            {
                if(j==0 || i==0) cnt[i][j]=1;
                else cnt[i][j]=cnt[i-1][j]+cnt[i][j-1];
            }
        }
        
        return cnt[m-1][n-1];

    }
    // int kgf(int m, int n)
    // {

    //     if(m>0 && n>0) return kfg()
    //     // if(m<=0 && n<=0) 
    //     // {
           
    //     //     return 1;
    //     // }
    //     // if(m<=0 || n<=0) return 1; 
        
    //     // int dn=kgf(m-1,n);
    //     // int rg=kgf(m, n-1);

    //     //  return dn+rg;
    // }
}