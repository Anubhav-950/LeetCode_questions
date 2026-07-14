class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        if(k==0 || n==1) return false;
        HashMap<Integer, Integer> oc=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(oc.containsKey(nums[i]) && Math.abs(oc.get(nums[i])-i) <= k)
            return true;
            oc.put(nums[i],i);
        }
        return false;

    }
}