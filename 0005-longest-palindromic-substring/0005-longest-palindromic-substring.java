class Solution {
    public String longestPalindrome(String s) {
        int st, r=s.length();
        int end;
        String  t="";
        int max=0, start=0;

       for(int i=0; i<s.length(); i++){
        st = end=i;
        while(st>=0 && end< r && s.charAt(st)==s.charAt(end)){
            if(end-st+1 > max) {
                max = end -st +1;
                start = st;
            }
            st--;
            end++;
        }

        st=i;
        end=i+1;
        while(st>=0 && end< r && s.charAt(st) == s.charAt(end))
        {
            if(end-st+1 > max){
                max = end -st + 1;
                start = st;
            }
            st--;
            end++;       
        }
       }

       return s.substring(start, start+max);

    }
}