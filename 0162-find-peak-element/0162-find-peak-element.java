class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=1, r=n-2, i;
        
        if(n==1 || nums[0]>nums[1])
        return 0;
        if(nums[n-1] > nums[n-2])
        return n-1;
        while(l<=r)
        {
            if(nums[l]>nums[l-1] )
            {
                if(nums[l]>nums[l+1])
                return l;
                
            }
            if(nums[r] > nums[r+1])
            {
                if(nums[r] > nums[r-1])
                return r;
                
            }
                l++;
                r--;
        }
        return -1;
    }
}