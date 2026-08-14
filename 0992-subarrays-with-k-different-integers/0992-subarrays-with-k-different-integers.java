class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atk(nums, k)-atk(nums, k-1);
    }
    int atk(int[] nums, int k)
    {
        int n=nums.length;
        Map<Integer, Integer> fq=new HashMap<>();
        int c=0, cnt=0, st=0;
        for(int i=0;i<n; i++)
        {
            fq.put(nums[i], fq.getOrDefault(nums[i], 0)+1);
            if(fq.get(nums[i]) == 1)
            k--;
            while(k<0)
            {
               fq.put(nums[st], fq.getOrDefault(nums[st],0)-1);
               if(fq.get(nums[st])==0)
               k++;
               st++; 
            }
            cnt+= i-st+1;
        }
        return cnt;
    }
}