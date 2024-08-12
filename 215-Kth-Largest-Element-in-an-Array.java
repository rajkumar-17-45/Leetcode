class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer> a=new PriorityQueue<Integer>();
     for(int i:nums)
     {
        if(a.size()<k)
        a.offer(i);
        else if(i>a.peek())
        {
            a.poll();
            a.offer(i);
        }
     }
     return a.peek();
    }
}