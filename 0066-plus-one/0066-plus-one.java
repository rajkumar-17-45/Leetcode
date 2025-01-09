import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        String sf=new String();
        for(int i:digits)
        sf+=i;
         BigInteger bg=new BigInteger(sf);
        BigInteger bg2=BigInteger.valueOf(1);
        BigInteger res=bg.add(bg2);
        String lis=res.toString();
        
        int arr[]=new int[lis.length()];
        for(int i=0;i<lis.length();i++)
        {
            arr[i]=lis.charAt(i)-48;
        }
        return arr;
    }
}