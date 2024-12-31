class Solution {
    public int numberOfSubstrings(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
             HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
            boolean flag=false;
             for(int j=i;j<s.length();j++)
             {
                char ch=s.charAt(j);
                 if(!mp.containsKey(ch))
                 mp.put(ch,1);
                 else
                 {
                      mp.put(ch,mp.get(ch)+1);
                 }
                 if(mp.get(ch)>=k)
                 {
                 flag=true;
                 }
                 if(flag)
                 c++;
             }
        }
       return c;

    }
}