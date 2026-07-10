class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        
        int max=1, st=0, cur=0;

        for(int i=0; i< n ;i++)
        {
            char ch=s.charAt(i);
            
           
            if(s.substring(st,i).contains(Character.toString(ch)))
            {
                st=s.substring(st,i).indexOf(ch)+st + 1;
            }
                max = Math.max(max , i-st+1);
        }
        
        return max;
    }
}