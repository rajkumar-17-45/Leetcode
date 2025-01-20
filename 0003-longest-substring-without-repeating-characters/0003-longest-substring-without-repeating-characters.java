class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        if(s.length()==1)
        return 1;
        int i=0;
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        int max=0;
        int j=1;
        mp.put(s.charAt(0),0);
        while(i<n && j<n)
        {
            char c=s.charAt(j);
            if(mp.containsKey(c))
            {
                if(mp.get(c)>=i)
                i=mp.get(c)+1;
            }
            mp.put(c,j);
            max=Math.max(max,j-i+1);
            j++;
        }  
        return max;
    }
}