class Solution {
    public String intToRoman(int num) {
        int x=num;
        int i=1;
        StringBuilder str=new StringBuilder();

        while(x>0)
        {
            int d=x%10;
            if(d>=1 && d<=3)
            {
                if(i==1)
                {
                    while(d>0)
                    {str.insert(0, "I");
                    d--;}
                }
                else if(i==2)
                {
                    while(d>0)
                {str.insert(0, "X");
                d--;
                }
                }
                else if(i==3)
                {
                    while(d>0)
                    {
                        str.insert(0, "C");
                        d--;
                    }
                }
                else if(i==4){
                    while(d>0)
                    {
                        str.insert(0,"M");
                        d--;
                    }
                }
            }
            else if(d == 4)
            {
                if(i==1)
                {
                    str.insert(0, "IV");   
                }
                else if(i==2)
                {
                    str.insert(0, "XL");
                }
                else if(i==3)
                {
                        str.insert(0, "CD");   
                }
            }
            else if(d>=5 && d<=8)
            {
                if(i==1)
                {
                    str.insert(0,"V");
                    while(d%5 > 0)
                    {
                        str.insert(1,"I");
                        d--;
                    }
                }
                if(i==2)
                {
                    str.insert(0,"L");
                    while(d%5 > 0)
                    {
                        str.insert(1,"X");
                        d--;
                    }
                }
                if(i==3)
                {
                    str.insert(0,"D");
                    while(d%5 > 0)
                    {
                        str.insert(1,"C");
                        d--;
                    }
                }
            }
            else if(d==9)
            {
                if(i==1)
                {
                    str.insert(0, "IX");   
                }
                else if(i==2)
                {
                    str.insert(0, "XC");
                }
                else if(i==3)
                {
                        str.insert(0, "CM");   
                }
            }
            i++;
            x /=10;
        }
                
            
        return str.toString();
    }
}