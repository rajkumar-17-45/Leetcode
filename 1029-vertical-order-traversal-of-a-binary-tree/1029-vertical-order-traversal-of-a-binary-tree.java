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
 class Tuple
 {
    
    TreeNode node;
    int v;
    int l;
    public Tuple(TreeNode node,int v,int l)
    {
        this.node=node;
        this.v=v;
        this.l=l;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> queue=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> mp=new TreeMap<>();
        List<List<Integer>> list=new ArrayList<>();
         queue.add(new Tuple(root,0,0));
         int lvl=0;
         while(!queue.isEmpty())
         {
             int s=queue.size();
             for(int i=0;i<s;i++)
             {
                Tuple parent=queue.poll();
                int val=parent.node.val;
                int v=parent.v;
                int l=parent.l;
                if(!mp.containsKey(v))
                {
                  TreeMap<Integer,List<Integer>> mp1=new TreeMap<>();
                  List<Integer> lt1=new ArrayList<>();
                  lt1.add(val);
                  mp1.put(l,lt1);
                  mp.put(v,mp1);
                }
                else
                {
                  TreeMap<Integer,List<Integer>> lk=mp.get(v);
                  if(!lk.containsKey(l))
                  {
                  List<Integer> lt1=new ArrayList<>();
                  lt1.add(val);
                  lk.put(l,lt1);
                  mp.put(v,lk);
                  }
                  else{
                    List<Integer> lt2=lk.get(l);
                    lt2.add(val);
                    lk.put(l,lt2);
                    mp.put(v,lk);
                  }
                        
                }
                if(parent.node.left!=null)
                {
                   queue.add(new Tuple(parent.node.left,v-1,l+1));
                }
                if(parent.node.right!=null)
                {
                 queue.add(new Tuple(parent.node.right,v+1,l+1));
                }
             }
         }
         for(int i:mp.keySet())
         {
            TreeMap<Integer,List<Integer>> mpl=mp.get(i);
            List<Integer> my=new ArrayList<>();
            for(int j:mpl.keySet())
            {
                List<Integer> last=mpl.get(j);
                 Collections.sort(last);
                 for(int k:last)
                 {
                    my.add(k);
                 }
                
            }
            // Collections.sort(my);
            list.add(my);
         }
        // System.out.println(mp);
        return list;
    }
}