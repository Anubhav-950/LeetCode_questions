class Solution {
    public String evaluate(String s, List<List<String>> k) {
        HashMap<String, String> tp=new HashMap<>();

        for(List<String> it:k)
        {
            tp.put(it.get(0), it.get(1));
        }

        StringBuilder ans=new StringBuilder();
        int n=s.length();

        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                StringBuilder str=new StringBuilder();
                while(ch != ')')
                {
                    i++;
                    ch=s.charAt(i);
                    if(ch!=')')
                    str.append(ch);
                }
                
                    if(tp.containsKey(str.toString()))
                    ans.append(tp.get(str.toString()));
                    else ans.append('?');
            }
            else ans.append(ch);
        }
        return ans.toString();
    }
}