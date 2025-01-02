import java.util.HashMap;
import java.util.Map;

class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0;
        int n = s.length();
        Map<Character, Integer> mp = new HashMap<>();
        int maxfreq = 0;
        int maxLength = 0;

        while (j < n) {
            char c = s.charAt(j);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            maxfreq = Math.max(maxfreq, mp.get(c));
             int winlen=j-i+1;
             if(winlen-maxfreq>k)
             {
                char leftchar=s.charAt(i);
                mp.put(leftchar,mp.get(leftchar)-1);
                i++;
             }
             maxLength=Math.max(maxLength,j-i+1);
             j++;
        }

        return maxLength;
    }
}
