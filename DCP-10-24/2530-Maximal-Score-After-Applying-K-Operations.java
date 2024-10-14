class Solution {
    public long maxKelements(int[] nums, int k) {
      PriorityQueue<Long> pq=new PriorityQueue<Long>(Collections.reverseOrder());
      for(long i:nums)
      pq.add(i);
      long result=0;
      for(int i=0;i<k;i++)
      {
      long val=pq.poll();
        result+=val;
        pq.add((val+2)/3);
      }
      return result;  
    }
}