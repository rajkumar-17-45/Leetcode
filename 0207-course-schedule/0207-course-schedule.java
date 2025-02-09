class Solution {
    public boolean canFinish(int n, int[][] r) {
        List<List<Integer>> l=new ArrayList<>(); 
        for(int i=0;i<n;i++)
        l.add(new ArrayList<>());
        for(int i=0;i<r.length;i++)
        {
            l.get(r[i][1]).add(r[i][0]);
        }
        int in[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int node:l.get(i))
            {
                in[node]++;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(in[i]==0)
            {
                queue.add(i);
            }
        }
        int cnt=0;
        while(!queue.isEmpty())
        {
            int nde=queue.poll();
            cnt++;
            for(int child:l.get(nde))
            {
                in[child]--;
                if(in[child]==0)
                {
                    queue.add(child);
                }
            }
        }
       if(cnt==n)
        return true;

        return false;
    }
}