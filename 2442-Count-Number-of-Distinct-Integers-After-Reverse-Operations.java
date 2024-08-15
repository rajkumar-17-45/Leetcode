class Solution {
    public int countDistinctIntegers(int[] nums) {
      Set<Integer> a=new HashSet<Integer>();
      for(int i=0;i<nums.length;i++)
      {
        a.add(nums[i]);
        int y=reverse(nums[i]);
        a.add(y);
      }
      return a.size();
    }
    int reverse(int n)
      {
        int num=0;
        while(n>0)
        {
            num=num*10+n%10;
            n/=10;
        }
        return num;
      }
}