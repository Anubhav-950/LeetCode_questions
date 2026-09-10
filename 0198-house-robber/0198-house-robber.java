class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n == 1) return nums[0];
        int p2=nums[0];
        int p1=Math.max(nums[0], nums[1]) ;
        int curi=p1;

        for(int i=2;i<n;i++)
        {
            curi=Math.max((nums[i]+p2), p1);
            p2=p1;
            p1=curi;

        }

        return curi;
    }
}