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
        int sum1=0;
        for(int i=0;i<26;i++)
        {
            sum1+=freq[i];
        }
        for(int i=0;i<n-m+1;i++)
        {
            String lp=new String();
            // int y=0;
            int freq2[]=new int[26];
            for(int k=i;k<i+m && k<n;k++)
            {
                freq2[s2.charAt(k)-'a']++;
                // lp+=s2.charAt(k);
            }
          if(check(freq,freq2))
          return true;
        }
        return false;
    }
   boolean check(int[] freq,int[] freq2)
   {
    
    
    boolean v;
    for(int i=0;i<26;i++)
    {
     if(freq[i]!=freq2[i])
     return false;
    }
    return true;
   }
}