class Pair {
    int i;
    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        int n = s.length();
        for (char c : t.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
                mp.put(c, mp.get(c) + 1);
            } else {
                hm.put(c, 1);
                mp.put(c, 1);
            }
        }

        int i = 0;
        int j = 0;
        for (char q : s.toCharArray()) {
            if (hm.containsKey(q)) {
                int val = hm.get(q);
                if (val == 0)
                    mp.remove(q);
                hm.put(q, hm.get(q) - 1);
                val = hm.get(q);
                if (val == 0)
                    mp.remove(q);
            }
            if (mp.isEmpty())
                break;
            j++;
        }
        // System.out.println(i + " " + j + " value"+hm);
        if (!mp.isEmpty())
            return "";
        Pair p = new Pair(i, j);
        while (i < n) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                if ((j - i + 1) < min) {
                    p = new Pair(i, j);
                    min = j - i + 1;
                }
                int val = hm.get(c);
                if (val == 0) {
                    j++;
                    while (j < n && s.charAt(i) != s.charAt(j)) {
                        if (hm.containsKey(s.charAt(j)))
                            hm.put(s.charAt(j), hm.get(s.charAt(j)) - 1);
                        j++;
                    }
                    //  System.out.println(j+" valueof j"+i);
                    if (j < n && s.charAt(i) == s.charAt(j)) {
                        if ((j - i + 1) < min) {
                            p = new Pair(i, j);
                            min = j - i + 1;
                        }
                    }

                    if (j >= n)
                        break;
                } else if (val < 0)
                {
                    // System.out.println("hellojk");
                    hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                }
            }
            i++;
        }
        String str=s.substring(p.i,p.j+1);
        return str;
    }
}