class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       HashMap<String,Integer> map=new HashMap<String,Integer>();
       for(String i:words)
       map.put(i,map.getOrDefault(i,0)+1);
       List<Map.Entry<String,Integer>> entry=new ArrayList<>(map.entrySet());
       entry.sort((a,b) ->{ 
     int cm=b.getValue().compareTo(a.getValue());
        if(cm!=0)
        return cm;
        else 
        return a.getKey().compareTo(b.getKey());
        
        });
       int u=0;
       List<String> result=new ArrayList<String>();
       int f=-1;
       for(Map.Entry<String,Integer> i:entry)
       {
        if(u>=k)
        break;
        result.add(i.getKey());
        u++;
       }
    
       return result;
    }
}