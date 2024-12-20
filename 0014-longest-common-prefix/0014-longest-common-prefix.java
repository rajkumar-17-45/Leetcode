class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==1)
        return strs[0];
        String a=strs[0];
        String b=strs[strs.length-1];
        String res=new String();
        if(a.length()>b.length())
        {
          for(int i=0;i<b.length();i++)
          {
            if(a.charAt(i)==b.charAt(i))
            res+=a.charAt(i);
            else
            break;
          }
        }
        else
        {
         for(int i=0;i<a.length();i++)
          {
            if(a.charAt(i)==b.charAt(i))
            res+=a.charAt(i);
            else
            break;
          }
        }
        return res;
    }
}