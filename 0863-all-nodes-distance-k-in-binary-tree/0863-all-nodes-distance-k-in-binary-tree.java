/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode tar, int k) {
        
        HashMap<TreeNode, TreeNode>  q=new HashMap<>();
        ParentQue(q, root);
        Queue<TreeNode> visit =new LinkedList<>();
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(tar);
        visit.offer(tar);
        int dist=0;

        while(!que.isEmpty())
        {
            int l=que.size();

            if(dist++ == k) break;

            for(int i=0; i<l; i++)
            {
                TreeNode nd=que.poll();

                if(nd.left != null && !visit.contains(nd.left))
                {
                    que.offer(nd.left);
                    visit.offer(nd.left);
                }
                if(nd.right != null && !visit.contains(nd.right))
                {
                    que.offer(nd.right);
                    visit.offer(nd.right);
                }
                
                if(q.containsKey(nd) && !visit.contains(q.get(nd)))
                {
                    que.offer(q.get(nd));
                    visit.offer(q.get(nd));
                }
            }
        }

        List<Integer> ans= new ArrayList<>();

        while(!que.isEmpty())
        {
            ans.add(que.poll().val);
        }
        return ans;
                
    }
    void ParentQue(HashMap<TreeNode, TreeNode> q, TreeNode root)
    {
        Queue<TreeNode> tp=new LinkedList<>();
        tp.offer(root);
        while(!tp.isEmpty())
        {
            int l=tp.size();

            for(int i=0; i<l; i++)
            {
                TreeNode nd=tp.poll();
                if(nd.left != null)
                {tp.offer(nd.left);
                q.put(nd.left, nd);
                }
                if(nd.right != null)
                {
                    tp.offer(nd.right);
                    q.put(nd.right, nd);
                }
            }
        }

    }
}