class Pair
{
    char ch;
    int val;
    public Pair(char ch,int val)
    {
        this.ch=ch;
        this.val=val;
    }
}
class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        List<Pair> list=new ArrayList<Pair>();
        int n=chars.length;
        int l=0;
        char c=chars[0];
       while(i<n && j<n)
       {
          
        //   System.out.println(c+" "+chars[j]);
          if(c==chars[j])
          {

            l++;
          }
          else
          {
          
            list.add(new Pair(c,l));
            c=chars[j];
            l=1;
            i=j;
          }
          j++;
       }
       if(l>0)
         list.add(new Pair(chars[n-1],l));
    //    if(l>)
    //    System.out.println(l);
    List<Character> lis=new ArrayList<>();
       for(Pair p:list)
       {
         char c1=p.ch;
         int val=p.val;
         if(val<=9)
         {
            lis.add(c1);
            if(val>1)
            lis.add((char)(val+48));
            
         }
         else
         {
            lis.add(c1);
            String s=String.valueOf(val);
            for(char chr:s.toCharArray())
            lis.add(chr);
         }
       }
    //    System.out.println(lis);
       for(int k=0;k<lis.size();k++)
       {
        chars[k]=lis.get(k);
       }
       return lis.size();
    }
}