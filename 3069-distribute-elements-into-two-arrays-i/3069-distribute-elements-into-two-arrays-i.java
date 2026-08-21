class Solution {
    public int[] resultArray(int[] nums) {
        int l=nums.length;
        int[] a1=new int[l];
        int[] a2=new int[l];
        a1[0]=nums[0];
        int j=1, k=1;
        a2[0]=nums[1];
        for(int i=2;i<l;i++)
        {
            if(a1[j-1] > a2[k-1])
            {
                a1[j++]=nums[i];
            }
            else a2[k++]=nums[i];
        }
        k=0;
        for(int i=j; i<l;i++)
        {
            a1[i]=a2[k++];
        }
        return a1;
    }
}