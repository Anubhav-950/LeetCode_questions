class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double s=0.0;
        int st=0;
        double max=Integer.MIN_VALUE;

        for(int i=0; i<n;i++)
        {
            s += nums[i];
            if(i-st+1 == k)
            {
                max = Math.max(max, s/k);
                s -= nums[st];
                st++;
            }
        }

        return max;
    }
}