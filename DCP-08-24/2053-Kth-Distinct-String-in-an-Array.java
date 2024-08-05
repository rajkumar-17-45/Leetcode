class Solution {
    public String kthDistinct(String[] arr, int k) {
     LinkedHashMap<String,Integer> a=new LinkedHashMap<String,Integer>();
     for(int i=0;i<arr.length;i++)
     {
        if(a.containsKey(arr[i]))
        {
            a.put(arr[i],a.get(arr[i])+1);
        }
        else
        {
            a.put(arr[i],1);
        }
     }  
     int c=0;
     for(String v:a.keySet())
     {
         if(a.get(v)==1)
         {

            c++;
         }
         if(c==k)
         {
            return v;
         }
     }

     return ""; 
    }
}