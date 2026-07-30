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
    public int maxPathSum(TreeNode root) {

         int []maxpathsum=new int[1];
         maxpathsum[0]=Integer.MIN_VALUE;
        // //maxpathsum[0]=Integer.MIN_VALUE;
        // if(root.left == null && root.right==null)
        // return root.val;
         treePathSum(root, maxpathsum);
         return maxpathsum[0];
    }
    int treePathSum(TreeNode root, int[] max )
    {
        if(root == null) return 0;

        int lsum=Math.max(0, treePathSum(root.left, max));
        int rsum=Math.max(0, treePathSum(root.right, max));

        max[0]=Math.max(max[0], root.val+lsum+rsum);

        return root.val+Math.max(lsum,rsum);
        // int lsum=0,rsum=0;
        // max[0]=Math.max(max[0], root.val);

        // if(root.left != null)
        // {lsum=treePathSum(root.left, max);
        // max[0]=Math.max(max[0], lsum);
        // max[0]=Math.max(max[0], lsum+root.val);}

        // if(root.right != null)
        // {rsum=treePathSum(root.right, max);
        // max[0]=Math.max(max[0], rsum);
        // max[0]=Math.max(max[0], rsum+root.val);}

        // if(root.right != null && root.left != null)
        // max[0]=Math.max(max[0], lsum+rsum+root.val);

        // return Math.max(root.val+lsum+rsum, Math.max(root.val, Math.max(lsum,rsum)));
    }
}