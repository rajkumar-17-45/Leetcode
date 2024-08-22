class Solution {
    public int bitwiseComplement(int n) {
         String a=Integer.toBinaryString(n);
        String res=new String();
        for(int i=0;i<a.length();i++)
        {
                if(a.charAt(i)=='0')
                res+='1';
                else
                res+='0';
        }
       
        return Integer.parseInt(res,2);
    }
}