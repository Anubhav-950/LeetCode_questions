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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int i=inorder.length-1, pi=postorder.length-1;
        TreeNode root=new TreeNode(postorder[pi--]);
        Stack<TreeNode> st=new Stack<>();
        st.push(root);

        // TreeNode newnd=null;

        while(pi >= 0)
        {
            TreeNode nd=st.peek();

            if(nd.val != inorder[i])
            {
                nd.right=new TreeNode(postorder[pi--]);
                st.push(nd.right);
            }
            else
            {
                TreeNode newnd=null;

                while(!st.isEmpty() && st.peek().val == inorder[i])
                {
                    newnd=st.pop();
                    i--;
                }

                newnd.left=new TreeNode(postorder[pi--]);
                st.push(newnd.left);
            }
        }
            
        return root;
    }
}