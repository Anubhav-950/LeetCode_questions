class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(k==n) return "0";

        Stack<Character> st=new Stack<>();
        int l=k;
        for(int i=0;i<n;i++)
        {
            char c=num.charAt(i);
            while(!st.isEmpty() && c < st.peek() && l>0)
            {
                st.pop();
                l--;
            }

            st.push(c); 
        }

        while(l>0)
        {
            st.pop();
            l--;
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty())
        str.append(st.pop());

        while(str.length() > 0 && str.charAt(str.length()-1) == '0')
        str.deleteCharAt(str.length()-1);
        if(str.length() == 0) return "0";

        str.reverse();

        return str.toString();
    }
}