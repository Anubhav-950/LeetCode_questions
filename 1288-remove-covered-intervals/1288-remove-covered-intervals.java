class Solution {
    public int removeCoveredIntervals(int[][] itv) {
        int len = itv.length;
        int c=len;

        for(int i=0;i<len; i++)
        {
            if(itv[i][0] == itv[i][1] && itv[i][1]==0) continue;
            for(int j=i+1; j<len; j++)
            {
                if(itv[j][0] == itv[j][1] && itv[j][1]==0) continue;
                if(itv[i][0] <= itv[j][0] && itv[i][1]>= itv[j][1])
                {
                    Arrays.fill(itv[j], 0);
                    c--;
                }
                else if(itv[j][0] <= itv[i][0] && itv[j][1] >= itv[i][1])
                {
                    Arrays.fill(itv[i], 0);
                    c--;
                }
            }
        }
        return c;

    }
}