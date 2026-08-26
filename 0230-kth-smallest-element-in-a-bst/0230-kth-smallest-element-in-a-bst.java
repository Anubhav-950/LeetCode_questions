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
    int k;
    int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        this.ans=-1;
        inorder(root);
        return ans;
    }
    void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);

            if(--k == 0)
            {
                ans=root.val;
                return;
            }

            inorder(root.right);
        }
    }
}