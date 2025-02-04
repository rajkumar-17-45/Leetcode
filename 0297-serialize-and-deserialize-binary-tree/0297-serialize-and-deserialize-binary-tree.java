/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {
        List<String> l = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        if (root == null)
            return "";
        StringBuffer sb = new StringBuffer();
        sb.append(root.val);
        sb.append("@");
        while (!queue.isEmpty()) {
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                    sb.append(node.left.val);
                    sb.append("@");
                }
                if (node.left == null) {
                    sb.append("#");
                    sb.append("@");
                }
                if (node.right != null) {
                    queue.add(node.right);
                    sb.append(node.right.val);
                    sb.append("@");
                }
                if (node.right == null) {
                    sb.append("#");
                    sb.append("@");
                }
            }
        }
        sb.setLength(sb.length()-1);
        // System.out.println(sb);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.length()==0)
        return null;
        String arr[]=data.split("@");
        // System.out.println(Arrays.toString(arr));
          if(arr.length==0)
        return new TreeNode();
        TreeNode res=new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(res);
        int i=1;
        while(!queue.isEmpty() && i<arr.length)
        {
                TreeNode n=queue.poll();
                
                if(!arr[i].equals("#"))
                {
                    TreeNode l=new TreeNode(Integer.parseInt(arr[i]));
                    queue.add(l);
                    n.left=l;
                 
                }
                i++;
               
                if(i<arr.length && !arr[i].equals("#"))
                {
                    TreeNode l=new TreeNode(Integer.parseInt(arr[i]));
                   queue.add(l);
                   n.right=l; 
                }
               
                i++;
                //  System.out.println(queue);
            }
            // System.out.println();
            return res;
        }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));