class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int i=0, j=n-1;
        int max=0;

        while(i<j)
        {
            int ht = Math.min(h[i],h[j]);
            int vol=(j-i)*ht;
            max= Math.max(max, vol);
            if(h[i]==ht)
            i++;
            else j--;
        }
        return max;
    }
}