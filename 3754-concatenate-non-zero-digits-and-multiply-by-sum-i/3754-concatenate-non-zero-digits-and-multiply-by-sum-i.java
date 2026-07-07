class Solution {
    public long sumAndMultiply(int n) {

        int t = n;
        int s=0, x=0;

        while(t>0)
        {
            int d=t%10;
            if(d!=0)
            {
                x=x*10+d;
                s += d;
            }
            t=t/10;
        }
        t=x;
        x=0;
        while(t>0)
        {
            int d=t%10;
            x=x*10+d;
            t /= 10;
        }

        return (long)x*s;
    }
}