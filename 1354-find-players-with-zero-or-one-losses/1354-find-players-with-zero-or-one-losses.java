class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n=matches.length;
      
        int max=-1;
          for(int[] x:matches)
        {
            int a=x[0];
            int b=x[1];
            a=Math.max(a,max);
            max=Math.max(a,b);
        }
        // System.out.println(max);
          int arr[]=new int[max+1];
        for(int[] x:matches)
        {
            int a=x[0];
            int b=x[1];
            if(arr[a]>=0)
            arr[a]++;
            if(arr[b]<0)
            arr[b]--;
            else
            arr[b]=-1;
        }
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        for(int i=1;i<=max;i++)
        {
          if(arr[i]==-1)
          l2.add(i);
          if(arr[i]>=1)
          l1.add(i);
        }
        List<List<Integer>> list=new ArrayList<>();
        list.add(l1);
        list.add(l2);
        // System.out.println(l1+" "+l2);
        return list;
    }
}