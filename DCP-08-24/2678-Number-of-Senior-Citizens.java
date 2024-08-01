class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
                  char c=details[i].charAt(11);
                  char d=details[i].charAt(12);
                  int y=(c-48)*10+(d-48);
            if(y>60)
            count++;
        }
        return count;
    }
}