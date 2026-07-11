class Solution {
    public int minSubArrayLen(int tar, int[] nums) {
        int len=nums.length;
        int s=0, min=len+1;
        int st=0;
        for(int i=0;i<len; i++)
        {
            s+=nums[i];

            while(s>=tar)
            {
                min = Math.min(min, i-st+1);
                s -= nums[st++];
            }
        }
        if(min == len+1) return 0;
        return min;
    }
}