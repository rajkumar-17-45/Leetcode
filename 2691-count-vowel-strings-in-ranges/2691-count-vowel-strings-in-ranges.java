class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int sum[]=new int[n];
        int j=0;
        for(String word:words)
        {
           
            int l=word.length();
            if(l!=0)
            {
                  char c=word.charAt(0);
                  char c2=word.charAt(l-1);
               if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') && (c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'))
               {
                sum[j]=1;
               } 
            }
            j++;
        }
        // System.out.println(Arrays.toString(sum));
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=sum[i];
            sum[i]=s;
        }
        int n1=queries.length;
        int res[]=new int[n1];
        int k=0;
        for(int[] x:queries)
        {
            int l=x[0];
            int r=x[1];
            if(l==0)
            {
                res[k]=sum[r];
            }
            else 
            {
                res[k]=sum[r]-sum[l-1];
            }
            k++;
        }
        //  System.out.println(Arrays.toString(sum));
        // System.out.println(Arrays.toString(res));
        return res;
    }
}