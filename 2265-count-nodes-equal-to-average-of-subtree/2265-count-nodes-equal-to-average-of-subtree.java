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
    int cnt=0;
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;

        avg(root);
        return cnt;
    }
    Pair avg(TreeNode root){
        if(root==null) return new Pair(0,0);

        Pair lf=avg(root.left);
        Pair rg=avg(root.right);

        int avgr=(root.val+lf.sum+rg.sum)/(1+lf.no+rg.no);
        if(avgr == root.val)
        cnt++;

        return new Pair(root.val + lf.sum +rg.sum , 1+lf.no+rg.no);
    }
    class Pair{
        int sum;
        int no;
        Pair(int s, int n)
        {
            sum=s;
            no=n;
        }
    }
}