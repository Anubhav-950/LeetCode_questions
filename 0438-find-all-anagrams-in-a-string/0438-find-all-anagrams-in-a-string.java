class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int np=p.length();
        int ns=s.length();
        List<Integer> ans=new ArrayList<>();
        int[] win=new int[26];
        int[] tp=new int[26];
        int st=0;

        for(int i=0;i<np;i++)
        tp[p.charAt(i) - 'a']++;
        
        for(int i=0;i<ns;i++)
        {
            win[s.charAt(i) - 'a']++;
            if(i-st+1 == np)
            {
                boolean flag=true;
                for(int j=0; j<26; j++)
                {
                    if(win[j] != tp[j])
                    {flag=false;
                    break;}
                }
                if(flag)
                {
                    ans.add(st);
                }
                win[s.charAt(st) - 'a']--;
                st++;
                
            }
        }
            return ans;
    }
}