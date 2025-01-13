class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int max=0;
    for(int i:nums2)
    max=Math.max(max,i);
    int check[]=new int[max+1];
    Stack<Integer> stack=new Stack<Integer>();
    for(int i=nums2.length-1;i>=0;i--)
    {
       while(!stack.isEmpty() && stack.peek()<=nums2[i])
       stack.pop();
       check[nums2[i]]=stack.isEmpty()?-1:stack.peek();
           stack.push(nums2[i]);
    }
    int j=0;
    for(int i:nums1)
    nums1[j++]=check[i];
    //  System.out.println(Arrays.toString(check));
    return nums1;
    
    }
}