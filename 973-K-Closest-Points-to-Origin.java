class Pair
{
    int a[];
    double value;
    public Pair(int a[],double value)
    {
        this.a=a;
        this.value=value;
    }
    public double getValue()
    {
        return value;
    }
    public int[] getkey()
    {
        return a;
    }
    public String toString()
    {
        return a+" "+value;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> queue=new PriorityQueue<>((a,b) -> Double.compare(b.getValue(),a.getValue()));
        for(int i[]:points){
           double val=distance(i);
          
          Pair p=new Pair(i,val);
            if(queue.size()<k)
            {
                queue.offer(p);
            }
            else if(val<queue.peek().getValue())
            {
              queue.poll();
            queue.offer(p);
            }                                  
           } 
           int a[][]=new int[queue.size()][2];
           int j=0;
           for(Pair x:queue)
           {
         int h[]=x.getkey();
             a[j]=h;
           j++;
           }
          return a;
    }                                                                                  double distance(int distance[])   
   {
       int a=distance[0];
       int b=distance[1];
       double d=Math.sqrt(Math.pow((a-0),2)+Math.pow((b-0),2));
       return d;
}                                                                                   }