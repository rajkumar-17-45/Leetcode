class Solution {
    static final int mod=12345;
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++)
        {
             list.add(grid[i][j]%mod);
        }
        }
        int l=list.size();
        int prefix[]=new int[l];
        int suffix[]=new int[l];
        int mul=1;
        for(int i=0;i<l;i++)
        {
            mul=(mul*list.get(i))%mod;
            prefix[i]=mul;
        }
        mul=1;
          for(int i=l-1;i>=0;i--)
        {
            mul=(mul*list.get(i))%mod;
            suffix[i]=mul;
        }
        for(int i=0;i<l;i++)
        {
            int val=1;
           if(i-1>=0)
            val=(val*prefix[i-1])%mod;
            if(i+1<l)
            val=(val*suffix[i+1])%mod;
        // val=(int)val%mod;
        list.set(i,val);
        }
         int index=0;
           for(int i=0;i<m;i++){
        for(int j=0;j<n;j++)
        {
             grid[i][j]=list.get(index++);
        }
        }
           return grid;
    }
}
