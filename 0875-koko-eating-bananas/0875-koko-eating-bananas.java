class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len=piles.length;
        Arrays.sort(piles);
        if(len==h) 
        {
           return piles[len-1];
        }
        int l=1, r=piles[len-1], ans=piles[len-1];
        while(l<=r)
        {
            int mid=(l+r)/2;
            long hr=0;
            for(int i=len-1; i>=0;i--)
            {
                if(piles[i]<=mid)
                {
                    hr += i+1;
                    break;
                }
                hr+=piles[i]/mid;
                if(piles[i]%mid != 0) hr++;
            }
            if(hr<=h)
            {ans=mid;
            r=mid-1;}
            else if(hr > h)
            l=mid+1;
            
        }
        return ans;
    }
}