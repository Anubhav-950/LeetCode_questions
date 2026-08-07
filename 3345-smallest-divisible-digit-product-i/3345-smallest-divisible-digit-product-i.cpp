class Solution {
public:
    int smallestNumber(int n, int t) {
        
        for(int i=n;i<=100;i++)
        {
            int x=i, p=1;
            while(x>0)
            {
                int d=x%10;
                p*=d;
                x/=10;
            }
            if(p%t == 0)
            {
                
                return i;
            }
        }
        return n;
    }
};