class Solution {
    public String minWindow(String s, String t) {

        int slen = s.length();
        int tlen = t.length();
        if(tlen>slen) return "";
        int minst=-1, mwin=slen+1;
        int st = 0;
        Map<Character, Integer> freq=new HashMap<>();

        for (int i = 0; i < tlen; i++) {
            char c = t.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        
        for (int i = 0; i < slen; i++) {

            char ch = s.charAt(i);

            if(freq.containsKey(ch))
            {
                if(freq.get(ch) > 0)
                tlen--;
                freq.put(ch, freq.get(ch)-1);
            }

            if(!freq.containsKey(s.charAt(st)))
            st++;
            
            while(tlen==0)
            {
                if(mwin > i-st+1)
                {
                   mwin=i-st+1;
                   minst=st;
                }

                if(freq.containsKey(s.charAt(st)))
                {
                    freq.put(s.charAt(st), freq.get(s.charAt(st))+1);
                    if(freq.get(s.charAt(st)) > 0)
                    {
                        tlen++;
                    }
                }
                st++;
            }
        }



            // if (freq.containsKey(ch) && freq.get(ch)>0) {
            //     tlen--;
            // }
            // freq.put(ch, freq.getOrDefault(ch, 0)-1);

            // if(tlen==0)
            // {
            //     while(true)
            //     {
            //         char stch=s.charAt(st);
            //     if(freq.containsKey(stch) && freq.get(stch)==0)
            //     {
            //         break;
            //     }
            //     freq.put(stch, freq.getOrDefault(stch, 0)+1);
            //     st++;
            //     }

            //     if(i-st < mwin[1]-mwin[0])
            //     {
            //         mwin[0]=st;
            //         mwin[1]=i;
            //     }

            //     freq.put(s.charAt(st), freq.getOrDefault(s.charAt(st), 0)+1);
            //     tlen++;
            //     st++;
            // }
        //}
        if(minst == -1) return "";
        return s.substring(minst, minst+mwin);
    }
}