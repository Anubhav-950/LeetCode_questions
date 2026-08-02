class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSum(nums, goal)-countSum(nums, goal-1);
    }
    int countSum(int[] nums, int g)
    {
        if(g<0) return 0;

        int l=0;
        int sum=0, c=0;

        for(int r=0; r<nums.length;r++)
        {
            sum+=nums[r];

            while(sum > g)
            {
                sum -= nums[l];
                l++;
            }

            c += r-l+1;
        }
        return c;
    }
}