class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length;
        int c=0, cnt=0, st=0;
        for(int i=0;i<n; i++)
        {
            int[] fq= new int[n+1];
            for(int j=i; j<n; j++)
            {
                fq[nums[j]]++;
                if(fq[nums[j]] == 1)
                c++;
                
                if(c == k) cnt++;
                else if(c>k) break;
            }
            c=0;
        }
        return cnt;
    }
}