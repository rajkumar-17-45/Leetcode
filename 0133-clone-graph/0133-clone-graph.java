/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
       HashMap<Integer,List<Integer>> hm=new HashMap<>();
          HashMap<Integer,List<Integer>> rt=new HashMap<>();
            HashMap<Integer,Node> my=new HashMap<>();
    public Node cloneGraph(Node node) {
         if(node==null)
         return null;
         Node start=new Node(node.val);
       
              dfs(node);
                boolean visited[]=new boolean[hm.size()+1];
                my.put(start.val,start);
          construct(start,visited);
     
        //   dfs2(start);
        //    System.out.println(hm+" "+rt);
        
        return start;
    }
    void dfs(Node node)
    {
        if(hm.containsKey(node.val))
        return ;
        List<Integer> list=new ArrayList<>();
        hm.put(node.val,list);
        for(Node child:node.neighbors)
        {
              dfs(child);
            list.add(child.val);
        }
        hm.put(node.val,list);
    }
   
    void construct(Node p,boolean visited[])
    {
          int par=p.val;
        //   System.out.println(par);
         if(visited[par])
         return ;
         visited[par]=true;
        
         ArrayList<Node> ans=new ArrayList<>();
         for(int child:hm.get(par))
         {
            if(!visited[child])
            {
              
              Node reslt=new Node(child);
             my.put(reslt.val,reslt);
             p.neighbors.add(reslt);
               construct(reslt,visited);
            }
            else
            {
              p.neighbors.add(my.get(child));
            }
            //    ans.add(c);
         }
        //  p=new Node(p.val,ans);

    }
}