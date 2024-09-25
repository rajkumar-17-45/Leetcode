class Trie
{
    Trie child[]=new Trie[26];
    boolean end;
    int i=0;
}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie root=new Trie();
        for(String a:words)
        {
        insert(root,a);
        }
        int arr[]=new int[words.length];
        int j=0;
        for(String a:words)
        {
            arr[j++]=search(root,a);
        }
        return arr;
    }
    int insert(Trie root,String a)
    {
        Trie curr=root;
        int sum=0;
        for(char x:a.toCharArray())
        {
            if(curr.child[x-'a']==null)
            {
                curr.child[x-'a']=new Trie();
            }
            curr=curr.child[x-'a'];
            curr.i=curr.i+1;
            sum+=curr.i;
        }
        curr.end=true;
        return sum;
    }
    int search(Trie root,String a)
    {
        Trie curr=root;
        int sum=0;
         for(char x:a.toCharArray())
        {
            if(curr.child[x-'a']==null)
            {
                return sum;
            }
            curr=curr.child[x-'a'];
            sum+=curr.i;
        }
        return sum;
    }
}