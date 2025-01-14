class Solution {
    public int[] asteroidCollision(int[] nums) {
        List<Integer> stack=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           if(nums[i]>0)
           stack.add(nums[i]);
           else
           {
            while(!stack.isEmpty() && stack.get(stack.size()-1)>0 && stack.get(stack.size()-1)<Math.abs(nums[i]))
            stack.remove(stack.size()-1);
            if(!stack.isEmpty() && stack.get(stack.size()-1)==Math.abs(nums[i]))
            stack.remove(stack.size()-1);
            else if(stack.isEmpty() || stack.get(stack.size()-1)<0)
            stack.add(nums[i]);
           }
        } 

    int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        
        return result;
    }
}