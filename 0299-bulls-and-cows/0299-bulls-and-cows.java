class Solution {
    public String getHint(String s1, String s2) {
        int a=0;
        int b=0;
        int n=s1.length();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
         HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
         for(int i=0;i<n;i++)
         {
            char c=s1.charAt(i);
            char d=s2.charAt(i);
            if(c==d)
            a++;
            else
            {
                if(!hm.containsKey(c))
                hm.put(c,1);
                else
                hm.put(c,hm.get(c)+1);
                if(!hm2.containsKey(d))
                hm2.put(d,1);
                else
                  hm2.put(d,hm2.get(d)+1);
            }
         }
         for(char c:hm.keySet())
         {
            if(hm2.containsKey(c))
            {
                int val=hm.get(c);
                int val2=hm2.get(c);
                if(val2>=val)
                b+=val;
                else 
                b+=val2;
            }
         }
       String res=new String();
       res+=a+"A"+b+"B";
         return res;
    }
}