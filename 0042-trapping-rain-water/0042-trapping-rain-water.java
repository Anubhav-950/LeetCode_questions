class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int w=0;
        int i=0, start = 0, end=0;
        int j=n-1;
        
        while(i<j)
        {
            start = Math.max(start, h[i]); 
            end = Math.max(end, h[j]);

            if(start < end)
            {
                w+= start - h[i];
                i++;
            }
            else
            {
                w += end-h[j];
                j--;
            }
        }

        return w;
    }
}