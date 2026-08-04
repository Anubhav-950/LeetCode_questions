class Solution {
    public int numberOfSubstrings(String s) {
        //SOLUTION 1
        // int[] pre = new int []{-1,-1,-1};
        // int ans=0;

        // for(int i=0; i<s.length(); i++)
        // {
        //     pre[s.charAt(i)-'a'] = i;

        //     int minind= Math.min(pre[0], Math.min(pre[1],pre[2]));

        //     ans += minind+1;
        // }
        // return ans;

        //SOLUTION-2
        // int[] cnt = new int[]{-1,-1,-1};
        // int ans=0;
        // for(int r=0 ; r<s.length(); r++)
        // {
        //     cnt[s.charAt(r) - 'a'] = r;

        //     int minind = Math.min(cnt[0], Math.min(cnt[1],cnt[2]));

        //     ans += minind+1;
        // }
        // return ans;

        
        int []fq=new int[]{-1,-1,-1};
        int cnt=0;

        for(int i=0;i<s.length();i++)
        {
            fq[s.charAt(i) - 'a']=i;

            cnt+= Math.min(fq[0], Math.min(fq[1],fq[2]))+1;
        }

        return cnt;

    }
}