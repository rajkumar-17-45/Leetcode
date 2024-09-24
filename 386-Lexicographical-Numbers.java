class Trie
{
    Trie child[]=new Trie[10];
    boolean end;
}
class Solution {
    List<String> str=new ArrayList<String>();
    public List<Integer> lexicalOrder(int n) {
        String arr[]=new String[n];
         Trie y=new Trie();
        for(int i=1;i<=n;i++)
        {
        insert(y,String.valueOf(i));
        }
        traverse(y,new StringBuffer());
       List<Integer> a=new ArrayList<Integer>();
       for(String g:str)
       {
        if(!g.equals(""))
        {
            a.add(Integer.parseInt(g));
        }
       }
       return a;
    }
    void traverse(Trie node,StringBuffer sb)
    {
        if(node.child!=null)
        {
            str.add(sb.toString());
        }
        for(int i=0;i<10;i++)
        {
            if(node.child[i]!=null)
            {
                sb.append(i);
                traverse(node.child[i],sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    void insert(Trie root,String s)
    {
        Trie curr=root;
        for(char a:s.toCharArray())
        {
            if(curr.child[a-'0']==null)
            {
                curr.child[a-'0']=new Trie();
            }
            curr=curr.child[a-'0'];
        }
        curr.end=true;
    }
}