/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        StringBuilder str = new StringBuilder();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode nd = q.poll();

            if (nd == null) {
                str.append("#,");
                continue;
            }
            str.append(nd.val + ",");
            q.add(nd.left);
            q.add(nd.right);
        }
        
        System.out.println(str.toString());
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "")
            return null;

        String[] str = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int i = 1; i < str.length;i++) {
            TreeNode nd = q.poll();
            
                 if (!str[i].equals("#")){
                    TreeNode lft = new TreeNode(Integer.parseInt(str[i]));
                    nd.left=lft;
                    q.offer(lft);
                }

                if (++i < str.length) {
                    if (!str[i].equals("#")){
                        nd.right = new TreeNode(Integer.parseInt(str[i]));
                        q.offer(nd.right);
                    }
                }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));