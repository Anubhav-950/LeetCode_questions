class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans =new int[n];
        Stack<Integer> stk=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {
            stk.push(nums[i]);
        }
        for(int i=n-1; i>=0; i--)
        {
            while(!stk.isEmpty() && nums[i]>=stk.peek() )
            stk.pop();

            if(stk.isEmpty())
            ans[i]=-1;
            else
            ans[i]=stk.peek();

            stk.push(nums[i]);
        }
        return ans;
    }
}