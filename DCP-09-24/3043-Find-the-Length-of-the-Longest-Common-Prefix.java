class Trie
{
    Trie child[]=new Trie[10];
    boolean end;
}

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        String arr[]=new String[arr2.length];
         String ar[]=new String[arr1.length];
         int max=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++)
        {
            arr[i]=String.valueOf(arr2[i]);
           
        }
        for(int i=0;i<arr1.length;i++)
        {
            ar[i]=String.valueOf(arr1[i]);
        }
        Trie y=new Trie();
        for(String a:arr)
        {
            
            insert(y,a);
        }
        for(String a:ar)
        {
            max=Math.max(search(y,a),max);
        }
        return max;
    }
    void insert(Trie node,String s)
    {
        Trie curr=node;
        for(char c:s.toCharArray())
        {
          if(curr.child[c-'0']==null)
          {
            Trie newnode=new Trie();
            curr.child[c-'0']=newnode;
       
          }
          curr=curr.child[c-'0'];
        }
        curr.end=true;
    }
    int search(Trie t,String s)
    {
        int count=0;
        Trie curr=t;
        for(char c:s.toCharArray())
        {
       if(curr.child[c-'0']==null)
       {
       
       return count;
       }
       count++;
       curr=curr.child[c-'0'];
        }
        return count;
    }   
}