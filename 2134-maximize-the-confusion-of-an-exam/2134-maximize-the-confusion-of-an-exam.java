class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int i=0;
        int j=0;
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        int maxfreq=0;
        int maxlen=0;
        while(i<n && j<n)
        {
            char c=s.charAt(j);
            if(mp.containsKey(c))
            mp.put(c,mp.get(c)+1);
            else
            mp.put(c,1);
            maxfreq=Math.max(maxfreq,mp.get(c));
            int l=j-i+1;
            if(l-maxfreq>k)
            {
                char ch=s.charAt(i);
                mp.put(ch,mp.get(ch)-1);
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}