class Solution {
    public int smallestNumber(int n, int t) {
        int ans=n;
        for(int i=n; i<=100;i++)
        {
            int k=i, s=1;
            while(k>0)
            {
                int d=k%10;
                s*=d;
                k/=10;
            }
            if(s%t==0){
                ans=i;
                break;
            } 
        }
        return ans;
    }
}