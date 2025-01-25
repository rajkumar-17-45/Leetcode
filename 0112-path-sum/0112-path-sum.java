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
    public boolean hasPathSum(TreeNode root, int t) {
       return dfs(root,t);        
}
   boolean dfs(TreeNode root,int t)
   {
       if(root==null)
       return false;
      boolean b=dfs(root.left,t-root.val);
      boolean c=dfs(root.right,t-root.val);
    //   System.out.println(t+" "+root.val);
       if(t-root.val==0 && root.left==null && root.right==null)
       return true;
       return  b|c;
   }
}