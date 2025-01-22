class Solution {
    public int maxCoins(int[] piles) {
        int i=0;
        int n=piles.length;
        int l1=n-1;
        int l2=n-2;
        int sum=0;
        Arrays.sort(piles);
        while(i<l2)
        {
        sum+=piles[l2];
        l1=l1-2;
        l2=l2-2;
        i++;
        }
        return sum;
    }
}