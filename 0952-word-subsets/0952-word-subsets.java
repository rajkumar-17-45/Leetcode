import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
      
        HashMap<Character, Integer> hm = new HashMap<>();
        for (String s : words2) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char c : s.toCharArray()) {
                temp.put(c, temp.getOrDefault(c, 0) + 1);
            }
            for (char c : temp.keySet()) {
                hm.put(c, Math.max(hm.getOrDefault(c, 0), temp.get(c)));
            }
        }
        List<String> l = new ArrayList<>();
        for (String s : words1) {
            HashMap<Character, Integer> mp = new HashMap<>();
            for (char c : s.toCharArray()) {
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }

            boolean b = true;
            for (char c : hm.keySet()) {
                int val = hm.get(c);
                if (mp.getOrDefault(c, 0) < val) {
                    b = false;
                    break;
                }
            }
            if (b) {
                l.add(s);
            }
        }

        return l;
    }
}
