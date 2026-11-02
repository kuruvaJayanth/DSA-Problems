class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]  nums1 = new int[nums.length];
        int[] nums2 = new int[nums.length];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                nums1[p]=nums[i];
                p++;
            }
            else {
                nums2[n]=nums[i];
                n++;
            }
        }
        int pos=0,p1=0,p2=0;
        while(p1<p && p2 < n) {
                nums[pos++]=nums1[p1++];
                nums[pos++]=nums2[p2++];
        }
        return nums;
        
    }
}