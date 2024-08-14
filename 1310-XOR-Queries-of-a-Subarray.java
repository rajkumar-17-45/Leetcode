class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[]=new int[arr.length];
        a[0]=arr[0];
        int x=arr[0];
        int l[]=new int[queries.length];
        for(int i=1;i<arr.length;i++)
        {  
               x=x^arr[i];
           a[i]=x;
        }
         x=arr[0];
         int k=0;
        for(int i=0;i<queries.length;i++)
        {
            int m=queries[i][0];
            int n=queries[i][1];
            if(m==n)
            {
                l[k]=arr[m];
                k++;
            }
            else
            {
                if(m==0)
                l[k]=a[n];
                else if(m-1>=0)
                l[k]=a[n]^a[m-1];
                k++;
            }
        }
        
        return l;
    }
}