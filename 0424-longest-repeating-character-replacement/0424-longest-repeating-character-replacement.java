class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int st = 0, maxlen = 0, maxfreq=0;
        int[] freq=new int[26];
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch - 'A']++;
            maxfreq = Math.max(maxfreq, freq[ch-'A']);

            while((i-st+1) - maxfreq > k)
            {
                char start = s.charAt(st);
                freq[start - 'A']--;
                st++;
            }

            maxlen = Math.max(maxlen, i - st + 1);
        }
        return maxlen;
    }
}