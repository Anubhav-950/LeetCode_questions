class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sum=0;

        for(int i=0;i<n;i++)
        {
            int minele=nums[i];
            int maxele=nums[i];
            for(int j=i+1;j<n;j++)
            {
                minele=Math.min(minele, nums[j]);
                maxele=Math.max(maxele, nums[j]);

                sum += (long) (maxele-minele);
            }
        }
        return sum;
    }
}