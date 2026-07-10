class Solution {
    public int[] decrypt(int[] c, int k) {
        int n=c.length;
        int[] ans=new int[n];
        if(k==0) return ans;
        
        if(k<0)
        {
            int sum=0;
            for(int i=-1; i>=k;i--)
            {
                sum+=c[n+i];
            }
            int j=k;
            
            for(int i=0;i<n;i++)
            {
                ans[i]=sum;
                sum -= c[(n+j)%n];
                j++;
                sum += c[i];
            }
        }
        else
        {
            int sum=0;
            for(int i=1; i<=k; i++)
            {
                sum += c[i%n];
            }

            for(int i=0;i<n;i++)
            {
                ans[i]=sum;
                sum -= c[(i+1)%n];
                sum+= c[(i+k+1)%n]; 
            }
        }
        return ans;
    }
}