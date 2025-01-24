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
    boolean f=false;
    public boolean isSubtree(TreeNode root, TreeNode sub) {
       return subtree(root,sub);  
    }
    boolean subtree(TreeNode root,TreeNode sub)
    {
        if(root==null)
        return false;
        if(issame(root,sub))
        {
            // System.out.println(root);
        return true;
        }
        return subtree(root.left,sub) || subtree(root.right,sub);
    }
     boolean issame(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        return true;
        if(p!=null && q==null)return false;
        if(p==null && q!=null) return false;
        if(p.val!=q.val)
        return false;
        return issame(p.left,q.left) && issame(p.right,q.right);
    }
}