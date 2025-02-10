class Triple
{
     int weight;
     int val1;
     int val2;
     public Triple(int weight,int val1,int val2)
     {
        this.weight=weight;
        this.val1=val1;
        this.val2=val2;
     }
}
class Disjoint
{
    int parent[];
    int size[];
    public Disjoint(int n)
    {
       parent=new int[n+1];
       size=new int[n+1];
       Arrays.fill(size,1);
       for(int i=0;i<=n;i++)
       parent[i]=i;
    }
    int find(int node)
    {
        if(node==parent[node])
        {
            return node;
        }
        int v=find(parent[node]);
        return parent[node]=v;
    }
    boolean union(int u,int v)
    {
        int ul_u=find(u);
        int ul_v=find(v);
        if(ul_u==ul_v)
        return false;
        if(size[ul_u]<size[ul_v])
        {
            size[ul_v]+=size[ul_u];
            parent[ul_u]=ul_v;
        }
        else
        {
            size[ul_u]+=size[ul_v];
            parent[ul_v]=ul_u;
        }
        return true;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] x) {

       List<Triple> list=new ArrayList<>();
       int max=-1;
       for(int i=0;i<x.length;i++)
       {
        int a=x[i][0];
        int b=x[i][1];
        max=Math.max(max,Math.max(a,b));
        for(int j=i+1;j<x.length;j++)
        {
            int c=x[j][0];
            int d=x[j][1];
            list.add(new Triple(Math.abs(a-c)+Math.abs(b-d),i,j));
        }
       } 
        Collections.sort(list,(a,b)-> a.weight-b.weight);
      
        Disjoint ds=new Disjoint(x.length+1);
        int count=0;
        int c=0; 
         for(Triple t:list)
        {
            // System.out.println(ds.union(t.val1,t.val2));
           if(ds.union(t.val1,t.val2))
           {
             count+=t.weight;
            //  System.out.println(t.weight);
             c++;
           }
           if(c==x.length)
           return count;
        }
        //  System.out.println(list);
          return count;
    }
}