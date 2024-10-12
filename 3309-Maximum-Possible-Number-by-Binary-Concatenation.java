import java.math.BigInteger;
class Solution {
    public int maxGoodNumber(int[] nums) {
        String a[]=new String[3];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=Integer.toBinaryString(nums[i]);
        }
        BigInteger max=new BigInteger("-1");
        String x=a[0]+a[1]+a[2];
        BigInteger a1=new BigInteger(x,2);
        String x2=a[0]+a[2]+a[1];
        BigInteger a2=new BigInteger(x2,2);
        String y1=a[1]+a[0]+a[2];
        BigInteger b1=new BigInteger(y1,2);
        String y2=a[1]+a[2]+a[0];
        BigInteger b2=new BigInteger(y2,2);
        String z1=a[2]+a[1]+a[0];
        BigInteger c1=new BigInteger(z1,2);
        String z2=a[2]+a[0]+a[1];
        BigInteger c2=new BigInteger(z2,2);
        if(a1.compareTo(max)>0)
        max=a1;  
        if(a2.compareTo(max)>0)
        max=a2;
          if(b1.compareTo(max)>0)
        max=b1;
          if(b2.compareTo(max)>0)
        max=b2;
          if(c1.compareTo(max)>0)
        max=c1;
          if(c2.compareTo(max)>0)
        max=c2;
        return max.intValue();
    }
}