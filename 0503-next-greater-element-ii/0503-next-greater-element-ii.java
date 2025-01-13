class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[(n*2)];
        int index=arr.length/2;
        for(int i=0;i<n;i++)
        {
            arr[index++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        boolean flag=false;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=(n*2)-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
            stack.pop();
            if(i<=n-1)
            {
              
             nums[i]=stack.isEmpty()?-1:stack.peek();
            }
            stack.push(arr[i]);
        }

        return nums;
    }
}