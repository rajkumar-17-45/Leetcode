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
    List<List<Integer>> li=new ArrayList<List<Integer>>();
    List<Integer> l=new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        inorder(root,targetSum);
        return li;
    }
    void inorder(TreeNode root,int t)
    {
        if(root==null)
        return ;
        l.add(root.val);
        inorder(root.left,t);
        inorder(root.right,t);
        if(root.left==null && root.right==null)
        {
            if(sum(l,t))
           li.add(new ArrayList<>(l));
        }
        l.remove(l.size()-1);
    }
    boolean sum(List<Integer> li,int t)
    {
        int sum=0;
        for(int i:li)
        sum+=i;
        if(sum==t)
        return true;
        return false;
    }
}