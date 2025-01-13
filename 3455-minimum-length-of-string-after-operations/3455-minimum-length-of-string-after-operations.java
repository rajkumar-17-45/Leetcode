class Solution {
    public int minimumLength(String s) {
       HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
       for(char c:s.toCharArray())
       {
        mp.put(c,mp.getOrDefault(c,0)+1);
        if(mp.get(c)==3)
        mp.put(c,1);
       }
       int res=0;
    //    System.out.println(mp);
       for(char key:mp.keySet())
       res+=mp.get(key);
       return res;
    }
}