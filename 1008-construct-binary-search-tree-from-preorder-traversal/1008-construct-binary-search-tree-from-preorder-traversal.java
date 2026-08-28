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
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root=null;
        for(int i=0; i<preorder.length; i++)
        {
            root=bst(root, preorder[i]);
        }
        return root;
    }
    TreeNode bst(TreeNode root, int pre)
    {
        
        if(root == null) return new TreeNode(pre);
       
        if(pre>root.val)
        {
           root.right=bst(root.right, pre);
           return root;
        }
        if(pre<root.val)
        {    root.left=bst(root.left, pre);
        }
        return root;
    }
}
