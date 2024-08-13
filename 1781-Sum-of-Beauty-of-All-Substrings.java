class Solution {
    public int beautySum(String s) {
        int c = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int q : freq) {
                    if (q > 0) {
                        max = Math.max(max, q);
                        min = Math.min(min, q);
                    }
                }
                if(max-min>0)
                sum+=max-min;
            }

        }
        return sum;
    }
}