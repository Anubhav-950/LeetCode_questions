class Solution {
    int maxArea(int[] ht, int n)
    {
        int maxar=0;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<=n; i++)
        {
            while(!st.isEmpty() && (i<n?ht[i]:0)<=ht[st.peek()])
            {
                int ele=ht[st.pop()];
                int wt;
                if(st.isEmpty())
                {
                    wt=i;
                }
                else
                {
                    wt=i-st.peek()-1;
                }
                maxar=Math.max(ele*wt, maxar);
            }
            st.push(i);
        }
        return maxar;
    }
    public int maximalRectangle(char[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int[] ht=new int[c];
        int maxrec=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j] == '1')
                ht[j]++;
                else
                ht[j]=0;
            }

            maxrec=Math.max(maxrec, maxArea(ht, c));
        }
        return maxrec;
    }
}