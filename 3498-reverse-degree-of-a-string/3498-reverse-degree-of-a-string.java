class Solution {
    public int reverseDegree(String s) {
        int l=s.length();
        int ans=0;

        for(int i=1;i<=l;i++)
        {
            ans += ('z' - s.charAt(i-1) + 1)*i;
        }

        return ans;

    }
}