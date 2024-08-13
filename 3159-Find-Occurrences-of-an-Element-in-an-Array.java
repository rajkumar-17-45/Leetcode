class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int c[]=new int[queries.length];
         ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(x==nums[i])
            {
               a.add(i);
            }
        }
        int h=0;
        for(int i=0;i<queries.length;i++)
        {
            if(queries[i]<=a.size())
            {
              c[h++]=a.get(queries[i]-1);
            }
            else
            c[h++]=-1;
        }
          return c;
    }
}