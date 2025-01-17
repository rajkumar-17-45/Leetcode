class Solution {
    public boolean doesValidArrayExist(int[] arr) {
        int n=arr.length;
      int res[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
       sum^=arr[i];
      }  
   
    if((sum%2)!=0)
    return false;
      return true;      
    }
}