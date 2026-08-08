class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int n =arr.length;
        String rev = "";
        for(int i=n-1;i>=0;i--) {
            rev +=arr[i] + " ";
        }
        return rev.trim();
    }
        
}