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
    public int maxDepth(TreeNode root) {
        int max=0, mtree=0;

        if(root == null) return mtree;
        
        max++;
        mtree=  maxDepth(root.left);
        mtree=Math.max(mtree, maxDepth(root.right));

        return max + mtree;
    }
}