class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        return recurse(num,0);
    }
    int recurse(int num,int count)
    {
        if(num==0)
        return count;
        if(num%2==0)
        {
              count++;
       return  recurse(num/2,count);
        }
        if(num%2!=0)
        {
        count++;
        return recurse(num-1,count);
        }
        return 5;
    }
}