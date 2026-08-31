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
    TreeNode prev=null, first=null, sec=null;
    public void recoverTree(TreeNode root) {
       inorder(root);
       int tp=first.val;
       first.val=sec.val;
       sec.val=tp;
    }
    void inorder(TreeNode node)
    {
        if(node == null) return;

        inorder(node.left);

        if(prev != null && prev.val > node.val)
        {
            if(first == null) first=prev;
            sec=node;
        }
        prev=node;

        inorder(node.right);
    }
}