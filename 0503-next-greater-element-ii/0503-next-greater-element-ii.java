class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int index=arr.length/2;
        
        boolean flag=false;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=(n*2)-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=nums[i%n])
            stack.pop();
            if(i<=n-1)
            {
              
             arr[i]=stack.isEmpty()?-1:stack.peek();
            }
            stack.push(nums[i%n]);
        }

        return arr;
    }
}