class Solution {
    public boolean search(int[] nums, int tar) {
        int n=nums.length;
        int l=0, r=n-1;
        int tl,tr;

        while(l<=r)
        {
            int m=(l+r)/2;

            if(nums[m] == tar)
            {
                return true;
            }
            if(nums[m] == nums[l] && nums[m] == nums[r])
            {
                l++;
                r--;
                continue;
            }
            
            if(nums[m]>=nums[l])
            {
                if(nums[m] >= tar && nums[l]<=tar)
                r=m-1;
                else l=m+1;
            }
            else{
                if(nums[m]<=tar && nums[r]>=tar)
                l=m+1;
                else r=m-1;
            }

        }
           
        return false;
        
    }
}