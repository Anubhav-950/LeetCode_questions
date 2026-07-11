class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int and=k, st=0, max=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i] != 1)
           {
            while(and == 0)
            {
                if(nums[st] == 0)
                and ++;
                st++;
            }
            if( and != 0 )
            {
                and--;   
            }
           }
            max=Math.max(max, i-st+1);
        }
        return max;
    }
}