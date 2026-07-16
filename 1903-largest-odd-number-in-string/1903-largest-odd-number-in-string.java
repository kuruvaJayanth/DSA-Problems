class Solution {
    public String largestOddNumber(String num) {
        int a =num.length();
        for(int i=a-1;i>=0;i--) {
            if(num.charAt(i)%2==1) {
            return num.substring(0,i+1);
            }
        }
        return "";
        
    }
}