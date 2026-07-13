class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        int iter=1;
        List<Integer> tp=new ArrayList<>();
        Arrays.stream(nums).forEach(x -> tp.add(x));

        for(int i=2; i<=n; i++)
        {
            iter *= i;
        }

        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>(tp));
        
        for(int i=1; i<iter; i++)
        {
            int ind=-1;
            for(int j=n-2;j>=0;j--)
            {
                if(tp.get(j) < tp.get(j+1))
                {
                    ind=j;
                    break;
                }
            }

            if(ind == -1)
            {
                Collections.reverse(tp);
            }
            else{
                for(int j=n-1; j>ind; j--)
                {
                    if(tp.get(j) > tp.get(ind))
                    {
                       
                        Collections.swap(tp, j, ind);
                        Collections.reverse(tp.subList(ind+1, n));
                        
                        break;
                    }
                }
            }
            ans.add(new ArrayList<>(tp));
           
        }

            return ans;
    }
}