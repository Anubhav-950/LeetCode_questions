class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l=0, r=nums.length-1;
        
        if(nums.length > 1)
        {while(l<r)
        {
            int m=(l+r)/2;

            if(m-1 > 0 && m+1<nums.length-1)
            {
                if(m+1 < nums.length && m-1 >=0 && nums[m]!=nums[m+1] && nums[m-1]!= nums[m])
                return nums[m];
            
                if(nums[l]!=nums[l+1]) return nums[l];
                if(nums[r]!=nums[r-1]) return nums[r];
            
                if(nums[m]==nums[m-1] )
            {
                if((m-l+1)%2 != 0 )
                r=m-2;
                else l=m+1;
            }

            else if(nums[m]==nums[m+1] )
            {
                if((r-m+1)%2 != 0)
                l=m+2;
                else r=m-1;
            }
            }
            
            else
            {
                break;
            }
        }

        int m=(l+r)/2;
        if(nums[l]!=nums[l+1]) return nums[l];
        if(nums[r]!=nums[r-1]) return nums[r];
        if(nums[m] != nums[m+1] && nums[m]!=nums[m-1])
        return nums[m];
        }

        return nums[0];
        
    }
}