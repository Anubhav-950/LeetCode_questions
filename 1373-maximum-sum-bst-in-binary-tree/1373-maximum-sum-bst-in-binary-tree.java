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

 class Bst{
    boolean fg;
    int max, min, sum;
    Bst(boolean fg, int m,int mn, int s)
    {
        this.fg=fg;
        this.max=m;
        this.min=mn;
        this.sum=s;
    }
 }
class Solution {
    TreeNode prev=null;
    int ms=0; 
    public int maxSumBST(TreeNode root) {
        binaryTree(root);
        return ms;
        // Stack<TreeNode> st=new Stack<>();
        // st.push(root);
        // int ms=0;
        // while(!st.isEmpty())
        // {
        //     TreeNode nd=st.pop();

        //     ms=Math.max(ms, binaryTree(nd));

        //     if(nd.left !=null)
        //     st.push(nd.left);

        //     if(nd.right != null)
        //     st.push(nd.right);
        // }
    }
    Bst binaryTree(TreeNode node)
    {
        if(node == null) return new Bst(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        int s=0;
        Bst lsum=binaryTree(node.left);
        Bst rsum=binaryTree(node.right);
        int max=Math.max(lsum.max, Math.max(node.val,rsum.max));
        int min=Math.min(lsum.min, Math.min(node.val,rsum.min));

        if(lsum.fg && rsum.fg && lsum.max<node.val && rsum.min>node.val)
        {
            s+=lsum.sum+rsum.sum+node.val;
            ms=Math.max(ms,s);
            return new Bst(true, max,min,s);
        }

        else if(lsum.fg)
        {
            ms=Math.max(ms, lsum.sum);
        }
        else if(rsum.fg)
        ms=Math.max(ms, rsum.sum);

        return new Bst(false, max,min, 0);
    }
}