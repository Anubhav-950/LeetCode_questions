class Solution {
    int[] prevmin(int[] arr, int l)
    {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[l];
        for(int i=0;i<l;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]> arr[i])
            st.pop();

            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();

            st.push(i);
        }
        return ans;
    }
    int[] nextmin(int[] arr, int l)
    {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[l];
        for(int i=l-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>= arr[i])
            st.pop();

            if(st.isEmpty()) ans[i]=l;
            else ans[i]=st.peek();

            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;

        int[] nes= nextmin(arr, n);
        int[] prev= prevmin(arr, n);

        int mod=(int)1e9 +7;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            int l=i-prev[i];
            int r=nes[i]-i;
            // long f=*1L;
            int val=(int)(((long)(l*r)*arr[i])%mod);
            sum = (sum+val)%mod;
        } 
        return sum;    
    }
}