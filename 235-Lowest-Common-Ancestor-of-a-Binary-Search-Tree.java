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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return traverse(root,p,q);
    }
    TreeNode traverse(TreeNode root,TreeNode p,TreeNode q)
    {
     if(root==null || root==p || root==q)
     return root;
     TreeNode left=traverse(root.left,p,q);
     TreeNode right=traverse(root.right,p,q);
     if(left==null)
     return right;
     else if(right==null)
     return left;
     else
     return root;
    }
}