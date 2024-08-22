class Solution {
    public List<String> validStrings(int n) {
       List<String> l=new ArrayList<>();
       generate("",n,l);
       return l; 
    }
    void generate(String s,int length,List<String> l)
    {
        if(length==0)
        {
            if((s.contains("1") && !s.contains("00") )|| (s.length()==1 && s.contains("0") ))
            l.add(s);
            return ;
        }
        else
        {
            generate(s+'0',length-1,l);
            generate(s+'1',length-1,l);
        }
    }
}