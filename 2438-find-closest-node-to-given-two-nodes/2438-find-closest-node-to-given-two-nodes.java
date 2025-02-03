class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
       List<List<Integer>> l=new ArrayList<>();
       int n=edges.length;
       for(int i=0;i<n;i++)
       l.add(new ArrayList<>());
       for(int i=0;i<n;i++)
       {
        if(edges[i]!=-1)
       l.get(i).add(edges[i]);
       }
       int dist[]=new int[n];
       int dist2[]=new int[n];
       Arrays.fill(dist,Integer.MAX_VALUE);
       Arrays.fill(dist2,Integer.MAX_VALUE);
       dis(dist,node1,l);
       dis(dist2,node2,l);
       int val=0;
       int min=Integer.MAX_VALUE;
       int res=-1;
       for(int i=0;i<n;i++)
       {
        if(dist[i]==Integer.MAX_VALUE || dist2[i]==Integer.MAX_VALUE)
        {
            continue;
        }
        int m=Math.max(dist[i],dist2[i]);
        if(m<min)
        {
        min=m;
        res=i;
        }
        // min=Math.min(min,Math.max(dist[i],dist2[i]));
       }
       return res; 
    }
    void dis(int dis[],int val,  List<List<Integer>> l)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        dis[val]=0;
        pq.add(val);
        while(!pq.isEmpty())
        {
            int par=pq.poll();
            for(int j:l.get(par))
            {
                int d=dis[par]+1;
                if(d<dis[j])
                {
                    dis[j]=d;
                    pq.add(j);
                }
            }
        }
    }
}