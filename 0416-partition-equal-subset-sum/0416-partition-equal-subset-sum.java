class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;

        int sum=Arrays.stream(nums).sum();
        if(sum % 2 != 0 || n==1) return false;
        sum /= 2; 

        boolean dp[]=new boolean[sum+1];
        dp[0]=true;

        if(nums[0] <= sum)
        dp[nums[0]] = true;

        for(int j=1;j<n;j++)
        {
            boolean cur[]=new boolean[sum+1];
            cur[0]=true;
            for(int i=1; i<=sum; i++)
            {
                boolean notTaken = dp[i];
                boolean taken= false;

                if(nums[j] <= i)
                taken=dp[i-nums[j]];

                cur[i] = notTaken || taken;
            }
            dp = cur;
        }
    
        return dp[sum];
    }
}