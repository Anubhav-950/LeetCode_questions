class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> st=new HashMap<>();
        int max=0,s=0;
        for(int i=0;i<nums.length;i++)
        {
            st.put(nums[i], st.getOrDefault(nums[i],0)+1);
            
            while(st.get(nums[i])>k)
            {
               st.put(nums[s], st.get(nums[s])-1);
               s++;
            }
            
            max=Math.max(max, i-s+1);
        }

        return max;
    }
}