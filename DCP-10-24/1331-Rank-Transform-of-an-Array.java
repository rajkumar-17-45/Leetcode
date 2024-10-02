class Solution {
    public int[] arrayRankTransform(int[] a) {
        int an[]=Arrays.copyOf(a,a.length);
        // int an[]=new int[a.length];
       
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
       Arrays.sort(a);
      int j=1;
       for(int i : a) {
       if(!hm.containsKey(i))
       { 
       hm.put(i, j);
       j++;
       }
     }
    //    System.out.println(hm);
        for(int i=0;i<an.length;i++)
        {
             an[i]=hm.get(an[i]);
        }
        return an;
    }
}