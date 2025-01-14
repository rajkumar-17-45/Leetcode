class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int prev[]=new int[n];
        int next[]=new int[n];
         Stack<Integer> stack=new Stack<Integer>();
         for(int i=n-1;i>=0;i--)
         {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            stack.pop();
            next[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
         }
         stack=new Stack<Integer>();
         for(int i=0;i<n;i++)
         {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            stack.pop();
            prev[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
         }
         int max=0;
         for(int i=0;i<n;i++)
         {
            max=Math.max(max,(next[i]-prev[i]-1)*heights[i]);
         }
      
         return max;
    }
}