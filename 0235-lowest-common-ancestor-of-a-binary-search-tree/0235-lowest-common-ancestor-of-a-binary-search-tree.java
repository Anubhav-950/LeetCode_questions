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
        while(p.val<root.val && q.val<root.val)
        {
            root=root.left;
        }
        while(p.val>root.val && q.val>root.val)
        {
            root=root.right;
        }
        return lca(root,p,q);
    }
    TreeNode lca(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == p || root == q || root==null)
        return root;

        TreeNode lf=lca(root.left, p,q);
        TreeNode rg=lca(root.right, p,q);

        if(lf == null)return rg;
        if(rg == null)return lf;

        return root;
    }
}