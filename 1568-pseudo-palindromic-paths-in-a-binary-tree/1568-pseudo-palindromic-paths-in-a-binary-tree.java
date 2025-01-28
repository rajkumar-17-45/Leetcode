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
    int cnt=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root,new StringBuffer(),0);
        return cnt;
    }
    void dfs(TreeNode root,StringBuffer sb,int v)
    {
        if(root==null)
        return ;
        int l=v;
        v^=(1<<root.val);
        if(root.left==null && root.right==null)
        {
            if((v&(v-1))==0)
             cnt++;
        }
        dfs(root.left,sb,v);
        dfs(root.right,sb,v);
        v=l;
    }
    
}