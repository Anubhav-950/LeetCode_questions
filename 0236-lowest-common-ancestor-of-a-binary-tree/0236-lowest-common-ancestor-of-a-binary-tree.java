/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q)
        return root;

        TreeNode lf=lowestCommonAncestor(root.left, p,q);
        TreeNode rg=lowestCommonAncestor(root.right, p, q);


        if(lf == null) return rg;
        if(rg==null) return lf;

        return root;
    }
}