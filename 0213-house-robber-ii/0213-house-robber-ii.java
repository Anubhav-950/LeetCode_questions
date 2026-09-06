class Solution {
    int fn(int[] nums)
    {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1) return nums[0];

        if(n==2) return Math.max(nums[0], nums[1]);
        int[] a1=new int[n-1];
        int[] a2=new int[n-1];

        for(int i=0; i<n;i++)
        {
            if(i>0) a1[i-1]=nums[i];

            if(i<n-1) a2[i]=nums[i];
        }

        return Math.max(fn(a1),fn(a2));
    }
}