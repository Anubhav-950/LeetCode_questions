class Solution {
    public long maxTotalValue(int[] nums, int k) {
        
        long max=nums[0], min=nums[0]; 
        for(int i=0; i < nums.length; i++)
        {
            if(nums[i]>max) max=nums[i];
            else if(nums[i] < min) min=nums[i];
        }
        
        
            return k*(max-min);
    }
}