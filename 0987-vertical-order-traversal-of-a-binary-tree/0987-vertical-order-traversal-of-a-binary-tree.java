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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Pair> pr=new LinkedList<>();
        pr.offer(new Pair(root, 0,0));
        while(!pr.isEmpty())
        {
            Pair node=pr.poll();
            TreeNode tp=node.value;
            int v=node.vert;
            int l=node.lvl;

            map.putIfAbsent(v, new TreeMap<>());
            map.get(v).putIfAbsent(l, new PriorityQueue<>());
            map.get(v).get(l).offer(tp.val);

            if(tp.left != null)
            pr.offer(new Pair(tp.left, v-1, l+1));

            if(tp.right != null)
            pr.offer(new Pair(tp.right, v+1, l+1));

        }

        for(TreeMap<Integer, PriorityQueue<Integer>> a: map.values())
        {
            List<Integer> col=new ArrayList<>();

            for(PriorityQueue<Integer> b:a.values())
            {
                while(!b.isEmpty())
                col.add(b.poll());
            }
            ans.add(col);
        }
        
        return ans;
    }

    
}
class Pair{
    TreeNode value;
    int vert, lvl;
    Pair(TreeNode node, int v, int l)
    {
        value=node;
        vert=v;
        lvl=l;
    }
}
