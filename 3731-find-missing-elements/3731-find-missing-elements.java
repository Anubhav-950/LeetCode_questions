class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans =new ArrayList<>();
        boolean[] tp=new boolean[101];
        int min=nums[0], max=nums[0];
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
            tp[nums[i]]=true;
        }
        for(int i=min;i<max;i++)
        {
            if(!tp[i])
            {
                ans.add(i);
            }
        }
        return ans;

    }
}