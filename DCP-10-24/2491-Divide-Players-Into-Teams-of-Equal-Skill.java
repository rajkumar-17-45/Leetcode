class Solution {
    public long dividePlayers(int[] skill) {
      Arrays.sort(skill);
      int l=0;
      int r=skill.length-1;
      int f=0;
      int sum=0;
      long result=0;
      while(l<r)
      {
        // System.out.println(l+" "+r);
        if(f==0)
        {
           sum=sum+skill[l] +skill[r];
           result+=(skill[l]*skill[r]);
           f=1;
        }
        else if(f==1)
        {
            // System.out.println(sum);
            if(sum!=(skill[l]+skill[r]))
            {
                return -1;
            }
            else
            {
               result+=(skill[l]*skill[r]);
            }
        }
        l++;
        r--;
      }
    //   System.out.println(sum);
      return result;
    }
}