import java.math.BigInteger;  
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int a[]=new int[n*(n+1)/2];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
         sum+=nums[j];
          a[c]=sum;
          
         c++;
            }
        }
        Arrays.sort(a);
         BigInteger s=new BigInteger("0");
        BigInteger k=new BigInteger("1000000007");
        BigInteger b=BigInteger.ZERO;
        for(int i=left-1;i<right;i++)
        {
           b=b.add(BigInteger.valueOf(a[i]));
        }
         b=b.mod(k);
        // System.out.println(b);
        return b.intValue();
    }
}