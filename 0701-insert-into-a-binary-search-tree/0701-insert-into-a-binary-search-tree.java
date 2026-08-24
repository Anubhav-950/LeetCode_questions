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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // if(root == null) return new TreeNode(val);
        // if(val < root.val) 
        // {
        //      TreeNode tp=root.left;
             
        //     if(tp != null && val > root.left.val )
        //     {
        //         if(tp.right== null)
        //         tp.right=new TreeNode(val);
        //         else if( root.left.right.val > val)
        //         {
        //             root.left = new TreeNode(val);
        //         root.left.left = tp;
        //         root.left.right = tp.right;
        //         tp.right=null;
        //         }
                
        //     }
        //     else if(tp!= null && val < root.left.val)
        //     {
        //         if(tp.left == null )
        //         tp.left=new TreeNode(val);
        //        else if( root.left.left.val < val)
        //         {
        //             root.left = new TreeNode(val);
        //         root.left.left=tp.left;
        //         root.left.right=tp;
        //         tp.left=null;
        //         }
                
        //     }
        //     else {
        //         root.left=insertIntoBST(root.left,val);
        //         return root.left;
        //     } 
        // }

        // else if(val > root.val)
        // {
        //     TreeNode nd=root.right;
        //     if( nd != null && val < root.right.val)
        //     {
        //         if(nd.left == null)
        //         nd.left=new TreeNode(val);
        //         else if( val > nd.left.val)
        //         {root.right = new TreeNode(val);
        //         root.right.left = nd.left;
        //         root.right.right = nd;
        //         nd.left = null;}

        //     }
            
        //     else if(nd!=null && val > root.right.val)
        //     {
        //          if(nd.right == null)
        //          nd.right=new TreeNode(val);
        //         else if(val <root.right.right.val)
        //         {
        //             root.right=new TreeNode(val);
        //         root.right.left=nd;
        //         root.right.right=nd.right;
        //         nd.right = null;
        //         }
        //     }

        //     else {
        //         root.right=insertIntoBST(root.right, val);
        //         return root.right;
        //     } 

        // }

        // return root;

        if(root ==null)
        return new TreeNode(val);

        if(val > root.val)
        {
            root.right=insertIntoBST(root.right, val);
        }
        else
        root.left=insertIntoBST(root.left, val);

        return root;
    }
}