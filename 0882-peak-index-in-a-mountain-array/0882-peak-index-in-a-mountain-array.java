class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int n=arr.length;
      int l=0;
      int r=n-1;
      while(l<=r)
      {
        int mid=(l+r)/2;
        if(mid+1<n && mid-1>=0 && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
        {
            return mid;
        }
        else if(mid-1>=0 && arr[mid-1]>arr[mid])
        {
            r=mid-1;
        }
        else
        {
            l=mid+1;
        }
      }  
      return -1;
    }
}