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
    public int diameterOfBinaryTree(TreeNode root) {
        int max[]=new int[1];
        treelen(root, max);
        return max[0];
    }
    int treelen(TreeNode root, int []max)
    {
        if(root == null) return 0;
        
        int llen=treelen(root.left,max);
        int rlen=treelen(root.right,max);
        max[0]=Math.max(max[0], llen+rlen);

        return 1+Math.max(llen, rlen);
    }
    
}