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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      return sametree(p,q);
    }
    boolean sametree(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        return true;
        if((p!=null && q==null)||(p==null && q!=null) ||(p.val!=q.val))
        return false;
        return sametree(p.left,q.left) && sametree(p.right,q.right);
    }
}