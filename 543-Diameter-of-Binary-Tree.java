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
    int result=0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return result;
    }
    int traverse(TreeNode root)
    {
        if(root==null)
        return 0;
        int lh=traverse(root.left);
        int rh=traverse(root.right);
        result=Math.max(lh+rh,result);
        return Math.max(lh,rh)+1;
    }
}