class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> dis=new HashMap<>();
        long sum=0, maxs=0;
        int cnt=0;
        for(int i=0;i<k;i++)
        {
            cnt++;
            if(dis.containsKey(nums[i])) cnt--;
            dis.put(nums[i], dis.getOrDefault(nums[i],0)+1);
            sum += nums[i];
            
        }
        int st=0;
        for(int i=k;i<n;i++)
        {
            if(cnt == k)
            maxs=Math.max(maxs, sum);
            
            
            if(dis.get(nums[st])==1) {
                cnt--;
                dis.remove(nums[st]);
            }
            else{
                dis.put(nums[st], dis.get(nums[st])-1);
            }
            if(!dis.containsKey(nums[i])) cnt++;
            dis.put(nums[i], dis.getOrDefault(nums[i], 0)+1);
            
            sum+=nums[i];
            sum-=nums[st++];
        }
        if(cnt == k)
            maxs=Math.max(maxs, sum);
        
        return maxs;
    }
}