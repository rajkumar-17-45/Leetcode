class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        ArrayList<String> v=new ArrayList<String>();
          for(String x:a)
          {
              if(!x.trim().isEmpty())
              {
                v.add(x.trim());
              }
          }
          ArrayList<String> m=new ArrayList<String>();
         m= rev(v,0,v.size()-1);
             
          return String.join(" ",m);
     }
            static ArrayList<String> rev(ArrayList<String> k,int l,int r)
            {
           if(l>=r)
           {
           return k;
           }
            String temp=k.get(l);
           
            k.set(l,k.get(r));
            k.set(r,temp);
           return  rev(k,l+1,r-1);
            }
}