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
 class Pair
{
    TreeNode nod;
    int col;
    public Pair(TreeNode nod,int col)
    {
        this.nod=nod;
        this.col=col;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
        return new ArrayList<>();
        TreeMap<Integer,Integer> mp=new TreeMap<Integer,Integer>();
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty())
        {
            int s=queue.size();
            for(int i=0;i<s;i++)
            {
                Pair p=queue.poll();
                int val=p.nod.val;
                int col=p.col;
                if(p.nod.left!=null)
                {
                    queue.add(new Pair(p.nod.left,col+1));
                }
                if(p.nod.right!=null)
                {
                    queue.add(new Pair(p.nod.right,col+1));
                }
                mp.put(col,val);
            }
        }
        
        // System.out.println(mp);
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:mp.keySet())
        l.add(mp.get(i));
        return l;
    }
}