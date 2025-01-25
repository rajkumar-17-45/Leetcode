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
    List<String> l=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root,new StringBuffer());
        return l;   
    }
    void traverse(TreeNode root,StringBuffer sb)
    {
        if(root==null)
        return ;
        int le=sb.length();
        sb.append(root.val);
        boolean b=false;
           if(root.left!=null || root.right!=null)
            sb.append("->");
        traverse(root.left,sb);
        traverse(root.right,sb);
        if(root.left==null && root.right==null)
        {
            l.add(sb.toString());
        }
       
        sb.setLength(le);
        //  System.out.println(sb);
    }
}