class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        
        int na=arr.length;
        int nq = q.length;
        int[] prexor=new int[na];
        int ans[] = new int[nq];
        prexor[0]=arr[0];

        for(int i=1; i<na; i++)
        {
           prexor[i] = prexor[i-1]^arr[i];
        }
        for(int i=0; i<nq; i++)
        {
            if(q[i][0]==0)
           ans[i] = prexor[q[i][1]];
           else ans[i] = prexor[q[i][0]-1] ^ prexor[q[i][1]];
           
        }

        return ans;
    }
}