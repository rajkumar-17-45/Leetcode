class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=shifts.length;
        int arr[]=new int[s.length()];
        int prefix[]=new int[s.length()+1];
        for(int i=0;i<n;i++)
        {
            int a=shifts[i][0];
            int b=shifts[i][1];
            int c=shifts[i][2];
            if(c==0)
            {
                prefix[a]+=-1;
                prefix[b+1]+=1;
            }
             else 
            {
                prefix[a]+=1;
                prefix[b+1]+=-1;
            }
        }
        int sum=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<prefix.length;i++)
        {
            sum+=prefix[i];
            prefix[i]=sum;
        }
        // String res=new String();
        for(int i=0;i<s.length();i++)
        {
           char c=(char)(((s.charAt(i)+(prefix[i])%26-97+26)%26)+97);
           res.append(c);
        }
       
        return res.toString();
    }
}