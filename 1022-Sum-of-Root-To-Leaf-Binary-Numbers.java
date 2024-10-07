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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
       inorder(root,new StringBuffer()); 
        return sum;
    }
    void inorder(TreeNode root,StringBuffer sb)
    {
        if(root==null)
        return ;
         sb.append(root.val);
        inorder(root.left,sb);
        inorder(root.right,sb);
        if(root.left==null && root.right==null)
        {
           sum+=convert(sb);
        }
           sb.deleteCharAt(sb.length()-1);
    }
    int convert(StringBuffer sb)
    {
        int sum2=0;
        int j=0;
        for(int i=sb.length()-1;i>=0;i--)
        {
            if(sb.charAt(i)=='0')
          sum2+=Math.pow(2,j)*0;
         else  if(sb.charAt(i)=='1')
          sum2+=Math.pow(2,j)*1;
          j++;
        }
        return sum2;
    }
}