class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        
        int maxprod=nums[0], minprod=nums[0];
        int ans=nums[0];

        for(int i=1;i<n;i++)
        {
            if(nums[i]<0)
            {
                int tp=maxprod;
                maxprod=minprod;
                minprod=tp;
            }

            maxprod=Math.max(nums[i], maxprod*nums[i]);
            minprod=Math.min(nums[i], minprod*nums[i]);

            ans=Math.max(ans, maxprod);
        }
        return ans;
    }
}