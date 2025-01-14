class Solution {
    public long subArrayRanges(int[] nums) {
    int n=nums.length;
    int pse[]=new int[n];
    int nse[]=new int[n];
      int pge[]=new int[n];
       int nge[]=new int[n];
       Stack<Integer> stack=new Stack<Integer>();
       for(int i=0;i<n;i++)
       {
        while(!stack.isEmpty() && nums[stack.peek()]>nums[i])
        stack.pop();
        pse[i]=stack.isEmpty()?-1:stack.peek();
        stack.push(i);
       }
       stack=new Stack<Integer>();
       for(int i=0;i<n;i++)
       {
        while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
        stack.pop();
        pge[i]=stack.isEmpty()?-1:stack.peek();
        stack.push(i);
       }
       stack=new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
       {
        while(!stack.isEmpty() && nums[stack.peek()]<=nums[i])
        stack.pop();
        nge[i]=stack.isEmpty()?n:stack.peek();
        stack.push(i);
       }
         stack=new Stack<Integer>();
       for(int i=n-1;i>=0;i--)
       {
        while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
        stack.pop();
        nse[i]=stack.isEmpty()?n:stack.peek();
        stack.push(i);
       }
       long large=0;
       for(int i=0;i<n;i++)
       {
        large=(large+((long)(i-pge[i])*(long)(nge[i]-i)*(long)nums[i]));
       }
       long small=0;
        for(int i=0;i<n;i++)
       {
        small=(small+((long)(i-pse[i])*(long)(nse[i]-i)*(long)nums[i]));
       }
  
       return large-small;
    }
}