class Pair
{
    int value;
    int time;
    public Pair(int value,int time)
    {
        this.value=value;
        this.time=time;
    }
}
class Solution {

    public int leastInterval(char[] tasks, int n) {
       HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
       for(char c:tasks)
       {
        if(!hm.containsKey(c))
        hm.put(c,1);
        else
        hm.put(c,hm.get(c)+1);
       }
       PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
    for(char i:hm.keySet())
    pq.offer(hm.get(i)); 
    Queue<Pair> queue=new LinkedList<Pair>();
    int time=0;
    while(!pq.isEmpty() || !queue.isEmpty())
    {
    time++;
    if(!pq.isEmpty())
    {
        int add=pq.poll();
        add--;
        if(add!=0)
        {
            queue.add(new Pair(add,time+n));
        }
    }
    if(!queue.isEmpty() && queue.peek().time==time)
    {
        int val=queue.poll().value;
        pq.add(val);
    }
    }
    return time;
    }
}