/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root == null) return ans;
        
        TreeMap<Integer, ArrayList<Integer>> map=new TreeMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int lvl=1;        

        while(!q.isEmpty())
        {
            int s=q.size();
            map.putIfAbsent(lvl, new ArrayList<>());
            for(int i=1;i<=s;i++){
                TreeNode tp=q.poll();

                map.get(lvl).add(tp.val);

                if(tp.left != null)
                q.offer(tp.left);
                if(tp.right != null)
                q.offer(tp.right);
            }
            lvl++;
        }
        for(ArrayList<Integer> a:map.values())
        {
            int l=a.size();
            ans.add(a.get(l-1));
        }
        
        return ans;
    }
}
