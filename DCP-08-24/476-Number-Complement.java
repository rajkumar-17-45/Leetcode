class Solution {
    public int findComplement(int num) {
        String a=Integer.toBinaryString(num);
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