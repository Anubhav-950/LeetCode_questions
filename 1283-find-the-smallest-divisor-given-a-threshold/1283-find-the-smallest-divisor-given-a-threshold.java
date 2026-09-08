class Solution {
    public int smallestDivisor(int[] nums, int th) {
        int l=nums.length;

        int low=1, high=Arrays.stream(nums).max().getAsInt();
        long sum=0;
        int j=1;
    while(low <= high)
    {
        int md=(low+high)/2;
        sum=0;
        for(int i=0;i<l;i++)
        {
            sum+=Math.ceil((double)nums[i]/md);
            if(sum>th) break;
        }
        if(sum > th) 
            low=md+1;
            
        else if(sum <= th) {
            j=md;
            high=md-1;
        }
        
    }
    return j;
    }
}