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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean lefttoright=true;

        while(!q.isEmpty())
        {
            List<Integer> tp=new ArrayList<>();
            int l=q.size();
            for(int i=0;i<l;i++)
            {
                TreeNode temp=q.poll();
                //tp.add(temp.val);
                if(lefttoright)
                tp.add(temp.val);
                else
                tp.add(0,temp.val);

                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            
            lefttoright = !lefttoright;
            ans.add(tp);
        }
        return ans;
    }
}