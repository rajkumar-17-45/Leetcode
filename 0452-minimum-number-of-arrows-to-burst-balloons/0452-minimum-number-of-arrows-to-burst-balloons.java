class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int i=0;
        int n=points.length;
        int c=0;
        while(i<n)
        {
            int st=points[i][0];
            int end=points[i][1];
            int j=i+1;
            boolean f=false;
            // System.out.println(st+" "+end+i);
            c++;
            while(j<n)
            {
              int x=points[j][0];
              int y=points[j][1];
              if(end>=x)
              {
                  j++;
                  f=true;
              }
              else
              break;
            }
            if(f)
            i=j;
            else
            i++;
        }
        System.out.println(c);
        return c;
    }
}