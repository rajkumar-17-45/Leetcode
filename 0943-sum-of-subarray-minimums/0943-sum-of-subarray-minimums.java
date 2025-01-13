class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int next[]=new int[n];
        int prev[]=new int[n];
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
            stack.pop();
            prev[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack=new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
            stack.pop();
            next[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        long total=0;
        for(int i=0;i<n;i++)
        {
            long val1=(long)i-prev[i];
            long val2=(long)next[i]-i;
            long product=(val1 * val2) % 1000000007;
            long pro2=(arr[i])%1000000007;
            total=(total+((product*pro2)%1000000007))%1000000007;
        }
       
        return (int)total;
    }
}