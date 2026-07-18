class Solution {
    public int findGCD(int[] nums) {
        int maxel=nums[0];
        int minel=nums[0];
        for(int a : nums)
        {
            if(a>maxel) maxel=a;
            if(a<minel) minel=a;
        }
        if(maxel%minel == 0) return minel;
        for(int i=minel/2;i>1 ; i--)
        {
            if(minel%i ==0 && maxel%i == 0)
            return i;
        }
        return 1;
    }
}