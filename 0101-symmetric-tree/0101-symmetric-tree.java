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
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left == null && root.right == null)) return true;
        
        return check(root.left, root.right);
    }
    boolean check(TreeNode lf, TreeNode rg)
    {
        if(lf == null && rg == null)
        return true;

        if(lf==null || rg==null)
        return false;

        if(lf.val!=rg.val) return false;

        return check(lf.left, rg.right ) && check(lf.right, rg.left);
    }
}