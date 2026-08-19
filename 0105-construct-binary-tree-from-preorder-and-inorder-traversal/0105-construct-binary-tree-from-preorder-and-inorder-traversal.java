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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=new TreeNode(preorder[0]);        
        Stack<TreeNode> st1=new Stack<>();
        st1.push(root);
        int j=1, k=0;
        while(j < preorder.length)
        {
            TreeNode nd=st1.peek();

            if(nd.val != inorder[k])
            {
                nd.left=new TreeNode(preorder[j]);
                
                st1.push(nd.left);
                j++;
            }
            else
            {
                TreeNode nod=null;
                while(!st1.isEmpty() && st1.peek().val == inorder[k])
                {
                    nod=st1.pop();
                    k++;
                }
                    nod.right=new TreeNode(preorder[j++]);
                    st1.push(nod.right);
            }
        }

        return root;

    }
}