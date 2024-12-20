class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=0;
        int i=0;
        if(s.length()==0)
        return true;
        
        while(i<t.length() && x<s.length())
        {
            if(s.charAt(x)==t.charAt(i))
            {
            x++;
            }
            i++;
        }
        if(x==s.length())
        return true;
        return false;
    }
}