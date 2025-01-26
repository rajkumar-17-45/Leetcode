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
   
   public List<List<String>> printTree(TreeNode root) {
    List<List<String>> l=new ArrayList<>();
       int height=height(root);
       height--;
       int m=height+1;
       int n=(int)Math.pow(2,height+1)-1;
       for(int i=0;i<m;i++)
       {
        List<String> li=new ArrayList<String>();
        for(int j=0;j<n;j++)
        {
            li.add("");
        }
        l.add(li);
       }
       int a=0;
       int b=(n-1)/2;
       dfs(root,l,m,n,a,b,height);
    //    System.out.println(l);
       return l;
    }
    int height(TreeNode root)
    {
        if(root==null)
        return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    void dfs(TreeNode root,List<List<String>> l,int m,int n,int a,int b,int height)
    {
        // if(a>=m || b>=n)
        // return ;
        if(root==null)
        return ;
        // System.out.println(root.val);
        l.get(a).set(b,String.valueOf(root.val));
        int lft=b-(int)Math.pow(2,height-a-1);
        int rht=b+(int)Math.pow(2,height-a-1);
        dfs(root.left,l,m,n,a+1,lft,height);
        dfs(root.right,l,m,n,a+1,rht,height);
    }
}