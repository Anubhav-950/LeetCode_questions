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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root == null) return ans;
        Stack<TreeNode> st=new Stack<>();
        // Stack<TreeNode> st2=new Stack<>();
        st.push(root);

        while(!st.isEmpty())
        {
            ans.add(0, st.peek().val);
            TreeNode tp=st.pop();
            if(tp.left != null)
            {
                st.push(tp.left);
            }
            if(tp.right != null)
                st.push(tp.right);
            
        }

        // while(!st2.empty())
        // {
        //     ans.add(st2.pop().val);
        // }
        //Collections.reverse(ans);
        return ans;
    }
}