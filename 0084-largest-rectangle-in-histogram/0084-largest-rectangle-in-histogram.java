class Solution {
    public int largestRectangleArea(int[] ht) {
        int l=ht.length;
        if(l==1) return ht[0];

        int maxrec=0;


        Stack<Integer> st=new Stack<>();
        int[] arr1=new int[l];
        int[] arr2=new int[l];

        for(int i=0;i<l;i++)
        {
            while(!st.isEmpty() && ht[i]<=ht[st.peek()])
            {
                st.pop();
                // int min=Math.min(ht[st.peek()], ht[i]);
                // int maxrec=Math.max(maxrec, min*(i-st.peek()+1))
            }
            if(st.isEmpty()) arr1[i]=0;
            else arr1[i]=st.peek()+1;
            st.push(i);
        }
        st.clear();
        for(int i=l-1;i>=0;i--)
        {
            while(!st.isEmpty() && ht[i]<=ht[st.peek()])
            {
                st.pop();
            }

            if(st.isEmpty()) arr2[i]=l-1;
            else arr2[i]=st.peek()-1;

            st.push(i);
        }

        for(int i=0;i<l;i++)
        {
            int rec=(arr2[i]-arr1[i]+1)*ht[i];
            maxrec=Math.max(maxrec, rec);
        }
        return maxrec;
    }
}