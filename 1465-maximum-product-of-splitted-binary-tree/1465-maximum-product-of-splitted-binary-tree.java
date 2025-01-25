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
    long max=Long.MIN_VALUE;
    int mod=1000000007;
    public int maxProduct(TreeNode root) {
       long sum=sum(root);
         product(root,sum);
       return (int)(max%mod);
    }
    long sum(TreeNode root)
    {
       if(root==null)
       return 0;
       long leftsum=sum(root.left);
        long rightsum=sum(root.right);
        return leftsum+rightsum+root.val;
    }
    long product(TreeNode root,long s)
    {
       if(root==null)
       return 0;
       long leftsum=product(root.left,s);
        long rightsum=product(root.right,s);
        long t=leftsum+rightsum+root.val;
        max=Math.max(max,(s-t)*t);
        return t;
    }
}