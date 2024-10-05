class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int x=0;
        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n-m+1;i++)
        {
            String lp=new String();
            // int y=0;
            int[] z=freq.clone();
            int freq2[]=new int[26];
            for(int k=i;k<i+m && k<n;k++)
            {
                z[s2.charAt(k)-'a']--;             
            }
          if(check(z))
          return true;
        }
        return false;
    }
   boolean check(int[] freq)
   {
    boolean v;
    for(int i=0;i<26;i++)
    {
     if(freq[i]>0)
    return false;
    }
    return true;
   }
}