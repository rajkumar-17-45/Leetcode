class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       List<Integer> arr=new ArrayList<Integer>();
      for(int i:nums)
      {
        map.put(i,map.getOrDefault(i,0)+1);
      }
      List<Map.Entry<Integer,Integer>> entries=new ArrayList<>(map.entrySet());
      entries.sort((a,b)-> b.getValue().compareTo(a.getValue()));  
      ArrayList<Integer> a=new ArrayList<Integer>();
      int l=0;
       int n[]=new int[k];
       int h=0;
      for(Map.Entry<Integer,Integer> val:entries)
      {
        if(l>=k)
        break;
       
        n[h]=val.getKey();
        h++;
        l++;
    
      }
     
       return n;
}
}