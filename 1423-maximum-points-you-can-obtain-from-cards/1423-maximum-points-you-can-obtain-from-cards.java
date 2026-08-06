class Solution {
    public int maxScore(int[] nums, int k) {
        int l=nums.length;
        int lfs=0,rgs=0, rind=l-1;
        int ans=0;

        for(int i=0; i<k;i++)
        {
            lfs+=nums[i];
        }
        ans=lfs+rgs;
       for(int i=k-1; i>=0;i--)
       {
        lfs-=nums[i];
        rgs+=nums[rind--];

        ans=Math.max(ans, lfs+rgs);
       }
        return ans;
    }
}