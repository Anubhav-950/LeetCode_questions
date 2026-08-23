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
    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> ans=new ArrayList<>();
        // if(root == null) return ans;

        // Stack<Integer> q=new Stack<>();
        // q.push(root.right);
        // q.push(root);
        // q.push(root.left)
        // while(!q.isEmpty())
        // {
        //     if(q.peek().right != null)
        //     q.push(q.peek().right);
        //     if(q.peek().left!=null)
        //     q.push(q.pop().left);
        //     ans.add(q.peek());

        // }
            
            
        //     // if(root.left != null)
        //     // {
        //     //     ans.addAll(inorderTraversal(root.left)); 
        //     //     // ans.add(root.left.val);
        //     // }
            
        //     // ans.add(root.val);

        //     // if(root.right != null)
        //     // {
        //     //     ans.addAll(inorderTraversal(root.right));
        //     //     // ans.add(root.right.val);
        //     // }
        // return ans;


        List<Integer> ans=new ArrayList<>();
        TreeNode cur=root;
        while(cur!=null)
        {
            if(cur.left == null)
            {
                ans.add(cur.val);
                cur = cur.right;
            }
            else
            {
                TreeNode prev = cur.left;

                while(prev.right != null && prev.right != cur)
                {
                    prev=prev.right;
                }
                if(prev.right == null)
                {
                    prev.right=cur;
                    cur=cur.left;
                }
                else
                {
                    prev.right=null;
                    ans.add(cur.val);
                    cur=cur.right;
                }
            }
        }
        return ans;
    }
}