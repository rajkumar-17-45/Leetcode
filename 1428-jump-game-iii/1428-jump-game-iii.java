class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        boolean visited[]=new boolean[n];
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(start);
        visited[start]=true;
        while(!queue.isEmpty())
        {
            int i=queue.poll();
            if(arr[i]==0)
            return true;
           if(i+arr[i]<n && !visited[i+arr[i]])
           {
               queue.add(i+arr[i]);
               visited[i+arr[i]]=true;
           }
           if(i-arr[i]>=0 && !visited[i-arr[i]])
           {
            queue.add(i-arr[i]);
             visited[i-arr[i]]=true;
           }
        }
        return  false;
    }
}