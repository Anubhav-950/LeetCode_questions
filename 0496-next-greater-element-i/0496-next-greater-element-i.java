class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] ans =new int[n1];
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n1;i++)
        {
            for(int j=n2-1;j>=0;j--)
            {
               if(nums1[i]==nums2[j])
               {
                 while(!st.isEmpty() && nums2[j]>=st.peek())
                {
                    st.pop();
                }
                if(st.isEmpty())
                ans[i]=-1;
                else
                ans[i]=st.peek();
                st.push(nums2[j]);
                break;
               }
               else st.push(nums2[j]);
            }
            st.clear();
        }

        return ans;
    }
}