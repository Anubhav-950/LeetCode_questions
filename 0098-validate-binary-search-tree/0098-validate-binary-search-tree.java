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
    List<Integer> a=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root == null)
         return true;
        inorder(root);

        for(int i=1; i<a.size(); i++)
        {
            if(a.get(i)<=a.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
    void inorder(TreeNode root)
    {
        if(root == null) return;
        inorder(root.left);
        a.add(root.val);
        inorder(root.right);
    }
}