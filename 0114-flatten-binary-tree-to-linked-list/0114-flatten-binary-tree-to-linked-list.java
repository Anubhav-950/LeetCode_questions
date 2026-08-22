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
    public void flatten(TreeNode root) {
        
        Queue<TreeNode> lt=new LinkedList<>();
        rlr(root, lt);
         while(!lt.isEmpty())
         {
            TreeNode nd=lt.poll();
            nd.left=null;
            if(!lt.isEmpty())
            nd.right=lt.peek();
         }
    }

    void rlr(TreeNode root, Queue<TreeNode> lt)
    {
        if(root == null) return ;

        lt.add(root);
        rlr(root.left, lt);
        rlr(root.right, lt);

        return;
    }
}