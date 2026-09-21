class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int sum = accumulate(nums.begin(),nums.end(),0);
        if(sum % 2 == 1) return false;
        int target = sum / 2;
        vector<bool>dp(target+1,false);
        int n = nums.size();
        dp[0] = true;
        for(int i = 0; i < n; i++){
            for(int x = target; x >= nums[i]; x--){
                dp[x] = dp[x] | dp[x - nums[i]];
            }
        }
        
        return dp[target];
    }
};