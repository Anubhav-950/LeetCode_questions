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
        int llen=0, rlen=0, max=0;
        Stack<TreeNode> st =new Stack<>();
        st.push(root);
        while(!st.empty())
        {
            TreeNode tp=st.pop();
        llen=treelen(tp.left);
        rlen=treelen(tp.right);
        max=Math.max(max, llen+rlen);
        if(tp.left != null)
        st.push(tp.left);
        if(tp.right != null)
        st.push(tp.right);
        }

        return max;
    }
    int treelen(TreeNode lroot)
    {
        int max=0;
        if(lroot == null) return 0;
        max=treelen(lroot.left);
        max=Math.max(max, treelen(lroot.right));

        return max+1;
    }
    
}