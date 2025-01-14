class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int n=A.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            mp.put(A[i],mp.getOrDefault(A[i],0)+1);
             mp.put(B[i],mp.getOrDefault(B[i],0)+1);
            //  System.out.println(mp);
             if(mp.get(A[i])==2)
             c++;
             if(mp.get(B[i])==2 && A[i]!=B[i])
             c++;
             A[i]=c;
        }
        
        return A;
    }
}