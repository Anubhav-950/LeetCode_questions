class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int st = 0, maxlen = 0, maxfreq=0;
        HashMap <Character, Integer> freq=new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq, freq.get(ch));

            while((i-st+1) - maxfreq > k)
            {
                char start = s.charAt(st);
                freq.put(start, freq.get(start)-1);
                st++;
            }
            
            maxlen = Math.max(maxlen, i - st + 1);
        }
        return maxlen;
    }
}