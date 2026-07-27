class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        int max = 0, smax = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] > max) {
                smax=max;
                max = nums[i];
            }
            else{
            if(nums[i]>smax) smax=nums[i];
            }
        }
        return (max - 1) * (smax - 1);
    }
}