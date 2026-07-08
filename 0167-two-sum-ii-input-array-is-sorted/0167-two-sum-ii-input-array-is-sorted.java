class Solution {
    public int[] twoSum(int[] num, int tar) {
        int n = num.length;
        int i1=0,i2=n-1;
        int i=0, j=n-1;
        while(i<j)
        {
            if(tar-num[i] == num[j])
            {
                i1=i+1;
                i2=j+1;
            }
            else if(num[i]+num[j] < tar) {i++;
            continue;}
            j--;
        }
        return new int[]{i1, i2};
    }
}