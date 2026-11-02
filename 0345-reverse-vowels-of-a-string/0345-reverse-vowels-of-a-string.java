class Solution {
    public static boolean checkvowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left=0,right=charArray.length-1;
        while(left<=right) {
            while(left<right && !checkvowel(charArray[left])) {
                left++;
            }
            while(left<right && !checkvowel(charArray[right])) {
                right--;
            }
            char temp = charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}