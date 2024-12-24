class Solution {
    public boolean isHappy(int n) {
        if(n==1)
        return true;
        if(n==7)
        return true;
        int val=function(n);
        if(val==1 || val==7)
        return true;
        return false;
    }
    int function(int n)
    {
        if(n<10)
        return n;
        int m=0;
        while(n>0)
        {
            int mod=n%10;
            m+=(mod*mod);
            n/=10;
        }
        return function(m);
    }
}