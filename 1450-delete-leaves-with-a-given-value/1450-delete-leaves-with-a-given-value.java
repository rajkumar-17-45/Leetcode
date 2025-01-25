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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        
     if(!dfs(root,target))
        return null;
         return root;
    }
    boolean dfs(TreeNode root,int target)
    {
        if(root==null)
        return false;
        boolean left=dfs(root.left,target);
        boolean right=dfs(root.right,target);
        boolean res=left|| right;
        if(!left && root.left!=null)
        root.left=null;
        if(!right && root.right!=null)
        root.right=null;
        if(root.val!=target)
        res=true;
        return res;
    }
}