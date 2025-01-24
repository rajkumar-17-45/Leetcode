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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)
        return root2;
        if(root2==null)
        return root1;
        dfs(root1,root2);
        return root1;
    }
    void dfs(TreeNode root1,TreeNode root2)
    {
        if(root1==null && root2==null)
        return ;

        if(root2==null)
        return ;
        // System.out.println(root1.val+" "+root2.val);
        if(root1!=null && root2!=null)
        {
        root1.val+=root2.val;
        // System.out.println(root1.val+" j"+root2.val);
        }
        if(root1.right==null && root2.right!=null)
        {
            // System.out.println(root2.right.val+" kj");
            root1.right=root2.right;
            root2.right=null;
            // System.out.println(root2.right.val+" kj");
        }
        if(root1.left==null && root2.left!=null)
        {
            root1.left=root2.left;
            root2.left=null;
        }
        dfs(root1.left,root2.left);
        dfs(root1.right,root2.right);
    }
}