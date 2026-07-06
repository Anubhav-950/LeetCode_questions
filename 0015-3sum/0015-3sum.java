class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(n);
        int len = n.length;

        for(int i=0;i < len; i++)
        {
            if(i>0 && n[i] == n[i-1]) continue;

            int left = i+1, right = len-1;

            while(left < right)
            {
                int s = n[i] + n[left] + n[right];

                if(s == 0)
                {
                    ans.add(Arrays.asList(n[i], n[left], n[right]));
                    left++;
                    right--;

                    while(left < right && n[left] == n[left-1]) left++;

                    while(left < right && n[right] == n[right + 1]) right--;

                }
                else if(s < 0) left++;
                else right--;
            }
        }
        return ans;
    }
}