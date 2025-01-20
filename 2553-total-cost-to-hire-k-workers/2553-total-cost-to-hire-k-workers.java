class Solution {
    public long totalCost(int[] arr, int cnt, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq2=new PriorityQueue<Integer>();
        int n=arr.length;
       
        int x=0;
        int y=n-1;
         int l=n/2;
         int v=1;
        while(v<=k)
        {
            pq.add(arr[x++]);
            v++;
        }
          int z=1;
        while(z<=k)
        {
            if(x>y)
            break;
            pq2.add(arr[y--]);
        z++;
        }
        long t=0;
        int c=0;
               
        while(x<=y)
        {
    //    System.out.println(pq+"hj "+pq2+"dd "+x+" "+y);
            if(pq.peek()==pq2.peek())
            {
    
                if(!pq.isEmpty())
                {
            t+=pq.poll();
            c++;
                pq.add(arr[x++]);
                }
            }
            else if(!pq.isEmpty() && !pq2.isEmpty() && pq.peek()<pq2.peek())
            {
                if(!pq.isEmpty())
                {
                t+=pq.poll();
                c++;
                pq.add(arr[x++]);
                }
            }
            else
            {
            if(!pq2.isEmpty())
                {
                t+=pq2.poll();
                c++;
                pq2.add(arr[y--]);
                }
            }
            // if(x==y-1)
            // break;
            // System.out.
            if(c==cnt)
            break;
             
        }
        //    System.out.println(pq+"hj "+pq2+"dd "+x+" "+y);
         while((!pq.isEmpty() || !pq2.isEmpty()) && cnt-c>0)
        {
   
            if(pq.peek()==pq2.peek())
            {
    
                if(!pq.isEmpty())
                {
            t+=pq.poll();
            c++;
                }
            }
            else if(!pq.isEmpty() && !pq2.isEmpty() && pq.peek()<pq2.peek())
            {
                if(!pq.isEmpty())
                {
                t+=pq.poll();
                c++;
                }
            }
            else if(!pq.isEmpty() && pq2.isEmpty() )
            {
                if(!pq.isEmpty())
                {
                t+=pq.poll();
                c++;
                }
            }
            else
            {
            if(!pq2.isEmpty())
                {
                t+=pq2.poll();
                c++;
             
                }
            }
            // if(x==y-1)
            // break;
            // System.out.
            if(c==cnt)
            break;
             
        }
        //   System.out.println(pq+" "+pq2+"jj "+t);
        if(c<cnt)
        {
         
            int p=cnt-c;
            //  System.out.println("yes"+p+" "+t+" "+x+" "+y);
            while(x<y)
            {
                   
                t+=arr[x++];
                if(c==cnt)
                break;
                c++;
            }
        }
      
        return t;
    }
}
