class Solution {
    public int minDays(int[] bd, int m, int k) {
        int n=bd.length;
        if(n < m*k) return -1;
        int ans=-1;
        int low=Integer.MAX_VALUE, high=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            low=Math.min(low,bd[i]);
            high=Math.max(high, bd[i]);
        }

        while( low <= high)
        {
            int mid=(low + high)/2;

            if(ispossi(bd, mid, m,k))
            {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    boolean ispossi(int []b, int md, int m,int k)
    {
        int c=0,bq=0; 
        for(int a: b)
        {
            
            if(a<=md)
            {c++;
            if(c==k)
            {
                bq++;
                c=0;
            }
            }

            else
            c=0;

        }

        return bq>=m;
    }
}