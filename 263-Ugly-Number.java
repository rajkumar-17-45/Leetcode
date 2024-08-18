class Solution {
    public boolean isUgly(int n) {
  
        if(n<=0)
        return false;
        if(n==1)
        return true;
       int k=n;
      while(k%2==0)
        k/=2;
      while(k%3==0)
      k/=3;
      while(k%5==0)
      k/=5;

        if(k==1 || k==-1)
        return true;
        else
        return false;
      




       
    }
}
