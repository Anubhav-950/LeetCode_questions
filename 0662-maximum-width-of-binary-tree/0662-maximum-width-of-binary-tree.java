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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        int max=0,lvl=1;
        while(!q.isEmpty())
        {
            int l=q.size();
            int st=0, end=0;
            
            // TreeNode b=q.peek().left;
            for(int i=0;i<l;i++)
            {
                Pair tp=q.poll();
                TreeNode nd=tp.node;
                int ind=tp.value;

                if(i==0)
                st=ind;

                if(i == l-1)
                end=ind;

                if(nd.left != null)
                {
                    q.offer(new Pair(nd.left, 2*ind));
                }
                if(nd.right != null)
                q.offer(new Pair(nd.right, 2*ind+1));
            }
            
            
            max=Math.max(max, end-st+1);
            
        }
        return max;
    }
}

public class Pair{
    TreeNode node;
    int value;

    Pair(TreeNode nd, int val)
    {
        this.node=nd;
        this.value=val;
    }
}