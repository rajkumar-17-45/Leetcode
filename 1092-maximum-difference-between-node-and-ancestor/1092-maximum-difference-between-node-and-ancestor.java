 class Pair
 {
    int i;
    int j;
    public Pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
 }
class Solution {
    int maxi=0;
    public int maxAncestorDiff(TreeNode root) {
        ancestor(root);
        return maxi;
    }
    public Pair ancestor(TreeNode root)
    {
        
        if(root==null)
        return new Pair(-1,-1);
        
       Pair left=ancestor(root.left);
       Pair right=ancestor(root.right);
       System.out.println(root.val);
       int a=left.i;
       int b=left.j;
       int c=right.i;
       int d=right.j;
    //    System.out.println(a+" "+b+" "+c+" "+d+" "+root.val);
       if(a==-1)
       a=Integer.MAX_VALUE;
     if(b==-1)
       b=Integer.MAX_VALUE;
        if(c==-1)
       c=Integer.MAX_VALUE;
        if(d==-1)
       d=Integer.MAX_VALUE;
       int min=Math.min(a,Math.min(b,Math.min(c,d)));
        a=left.i;
        b=left.j;
        c=right.i;
        d=right.j;
        if(a==-1)
       a=Integer.MIN_VALUE;
     if(b==-1)
       b=Integer.MIN_VALUE;
        if(c==-1)
       c=Integer.MIN_VALUE;
        if(d==-1)
       d=Integer.MIN_VALUE;
        int max=Math.max(a,Math.max(b,Math.max(c,d)));


        // System.out.println(min+" "+max+" "+root.val);
        if(min!=Integer.MAX_VALUE)
        {
          maxi=Math.max(maxi,Math.abs(root.val-min));
        }if(max!=Integer.MIN_VALUE)
        {
          maxi=Math.max(maxi,Math.abs(root.val-max));  
        }
       if(min==Integer.MAX_VALUE && max==Integer.MIN_VALUE)
       {
            return new Pair(root.val,root.val);
       }
       if(min==Integer.MAX_VALUE)
       return new Pair(-1,max);
       if(max==Integer.MIN_VALUE)
       return new Pair(min,-1);
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        return new Pair(min,max);
    

    //  return new Pair(lmin,rmax);
    }
}
