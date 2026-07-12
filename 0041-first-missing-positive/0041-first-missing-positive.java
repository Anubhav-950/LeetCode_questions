class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        
        int[] tp=new int[n+2];
        tp[0]=1;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>0 && nums[i]<=n )
            {
               tp[nums[i]]=1; 
            }
        }
        int i;
        for(i=1;i<=n+1; i++)
        {
            if(tp[i]==0)
            return i;
        }
        
        return 1;
    }
}