class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList<Integer>();
          for(int i=1;i<=n;i++)
          list.add(i);
        return winner(list,0,k);
    }
    int winner(List<Integer> list,int i,int k)
    {
        if(list.size()==1)
        return list.get(0);
        int val=(i+k-1)%list.size();
        list.remove(val);
        return winner(list,val,k);
    }
}