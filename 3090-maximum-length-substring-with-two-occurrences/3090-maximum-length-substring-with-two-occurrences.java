class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> fq=new HashMap<>();
        int st=0,max=0;

        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            fq.put(ch, fq.getOrDefault(ch, 0)+1);

            while(fq.get(ch)>2)
            {
                char c=s.charAt(st);
                fq.put(c, fq.get(c)-1);
                st++;
            }
            max=Math.max(max, i-st+1);
        }
        
        return max;
    }
}