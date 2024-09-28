class Solution {
    List<List<Integer>> li=new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        List<Integer> ds=new ArrayList<Integer>();
        backtrack(nums,ds,0,k);
        return li;
    }
    void backtrack(int nums[],List<Integer> ds,int i,int k)
    {
        if(i==nums.length)
        {
            if(ds.size()==k)
            {
            li.add(new ArrayList<Integer>(ds));
            }
            return ;
        }
        ds.add(nums[i]);
        backtrack(nums,ds,i+1,k);
        ds.remove(ds.size()-1);
        backtrack(nums,ds,i+1,k);
    }
}