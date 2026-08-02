class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
    int count(int[] nums, int k)
    {
        int c=0,l=0;
        int cnt=0;

        for(int r=0; r<nums.length; r++)
        {
            if(nums[r]%2 != 0)
            c++;

            while(c>k)
            {
                if(nums[l]%2 != 0)
                c--;
                l++;
            }
            
            cnt += r-l+1;
        }

        return cnt;

    }
}