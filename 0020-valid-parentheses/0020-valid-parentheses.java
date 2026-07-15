class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int l=s.length();
        int i=0;
        for( i=0; i< l; i++)
        {
            char ch=s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            st.push(ch);

            else 
            {
                if(st.isEmpty())
                return false;
                if((ch == ')' && st.peek()=='(') || (ch == '}' && st.peek() == '{' ) || (ch == ']' && st.peek()=='['))
                st.pop();
                else
                return false;
            }
        }
        if(i==l && !st.isEmpty())
        return false;

        return true;
    }
}