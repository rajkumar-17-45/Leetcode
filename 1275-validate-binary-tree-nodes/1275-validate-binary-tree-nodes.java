class Disjoint
{
    List<Integer> size;
    List<Integer> parent;
    public Disjoint(int n)
    {
        size=new ArrayList<>();
        parent=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            size.add(1);
            parent.add(i);
        }
        // System.out.println(size+" "+parent);
    }
    int find(int node) {
    if (node != parent.get(node)) {
       
        parent.set(node, find(parent.get(node)));
    }
    return parent.get(node);
}

    boolean unionbysize(int u,int v)
    {
        // Syste
        int ul_u=find(u);
        int ul_v=find(v);
        // System.out.println(ul_u+" "+ul_v);
        if(ul_u==ul_v)
        return false;
        if(size.get(ul_u)<size.get(ul_v))
        {
            size.set(ul_v,size.get(ul_u)+size.get(ul_v));
            parent.set(ul_u,ul_v);
          
        }
        else
        {
            size.set(ul_u,size.get(ul_v)+size.get(ul_u));
            parent.set(ul_v,ul_u); 
            //   System.out.println(parent);
            //   Syste
        }
        return true;
    }
}
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] left, int[] right) {
        Disjoint ds=new Disjoint(n);
      for(int i=0;i<n;i++)
      {
        if(left[i]!=-1)
        {
            // System.out.println(i+" "+left[i]);
        if(!ds.unionbysize(i,left[i]))
        return false;
        }
        if(right[i]!=-1)
        {
        // System.out.println(i+" "+right[i]);
        if(!ds.unionbysize(i,right[i]))
        return false;
        }
      }
      HashSet<Integer> hs=new HashSet<Integer>();
      for(int i:ds.parent)
      {
        hs.add(ds.find(i));
      }
      List<Integer> l=new ArrayList<Integer>();
      for(int i=0;i<n;i++)
      {
        if(left[i]!=right[i] && left[i]!=-1)
        {
          l.add(left[i]);
        }
        if(right[i]!=-1 && left[i]!=right[i])
        l.add(right[i]);
      }
      HashSet<Integer> s=new HashSet<Integer>();
      for(int i=0;i<l.size();i++)
      {
        s.add(l.get(i));
      }
      if(s.size()!=l.size())
      return false;
    //   System.out.println(ds.parent);
      if(hs.size()==1)
      return true;
        return false;
    }
}