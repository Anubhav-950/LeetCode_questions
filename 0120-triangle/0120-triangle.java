class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        int n=tri.size();
        if(n==1) return tri.get(0).get(0);
        int[] minsumpath=new int[n];
        minsumpath[0]=tri.get(0).get(0);

        for(int i=1; i<n;i++)
        {
            List<Integer> m=new ArrayList<>(tri.get(i));
            List<Integer> tp=tri.get(i-1);
            for(int j=0;j<m.size();j++)
            {
                if(j==0)
                {
                    minsumpath[i]=tp.get(j) + m.get(j);
                    tri.get(i).set(j, minsumpath[i]);
                    continue;
                }
                if(j==m.size()-1)
                {    minsumpath[i]= Math.min(minsumpath[i], tp.get(j-1)+m.get(j));
                    tri.get(i).set(j, tp.get(j-1)+m.get(j));
                    continue;
                }
                    minsumpath[i]= Math.min(minsumpath[i], Math.min(tp.get(j), tp.get(j-1))+m.get(j));
                    tri.get(i).set(j, Math.min(tp.get(j), tp.get(j-1))+m.get(j));
                
            }
        }
         return minsumpath[n-1];
    }
}