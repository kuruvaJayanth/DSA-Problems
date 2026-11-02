class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length-1;
        int left=0,right=nums.length-1;
        while(left<=right) {
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];
            if(leftsquare>rightsquare) {
                result[index]=leftsquare;
                left++;
            }
            else {
                result[index]=rightsquare;
                right--;
            }
            index--;
        }
        return result;
        
    }
}