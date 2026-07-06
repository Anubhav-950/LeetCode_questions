import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm= new HashMap<>();
        
        int n=nums.length;
         
        for(int i=0; i<n ; i++){
            int compli=target- nums[i];
            if(hm.containsKey(compli)){
                return new int[] {hm.get(compli), i};
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}