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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root=insert(root,val);
        return root;
    }
    TreeNode insert(TreeNode root,int val)
    {
        if(root==null)
        {
            TreeNode c=new TreeNode(val);
            return c;
        }
        if(val<root.val)
        root.left=insert(root.left,val);
        if(val>root.val)
        root.right=insert(root.right,val);
        return root;
    }
}