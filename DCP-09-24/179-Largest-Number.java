class Solution {
    public String largestNumber(int[] nums) {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
         
        }
        Arrays.sort(str,(a,b) -> (b+a).compareTo(a+b));
        if(str[0].equals("0"))
        return "0";
        StringBuffer sb=new StringBuffer();
        for(String a:str)
        {
            sb.append(a);
        }
        
        return sb.toString();
    }
}