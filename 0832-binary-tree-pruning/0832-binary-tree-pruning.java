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
    public TreeNode pruneTree(TreeNode root) {
        if(!dfs(root))
        return null;
         return root;
    }
    boolean dfs(TreeNode root)
    {
        if(root==null)
        return false;
        boolean left=dfs(root.left);
        boolean right=dfs(root.right);
        boolean res=left|| right;
        if(!left && root.left!=null)
        root.left=null;
        if(!right && root.right!=null)
        root.right=null;
        if(root.val==1)
        res=true;
        return res;
    }
}