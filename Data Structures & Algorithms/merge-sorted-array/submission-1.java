class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0){
            int digitToMerge = nums2[n-1];
            for (int i = nums1.length - n; i >= 0; i--){
                if (i == 0){
                    nums1[i] = digitToMerge;
                    break;
                }
                if (nums1[i-1] > digitToMerge){
                    int temp = nums1[i-1];
                    nums1[i-1] = 0;
                    nums1[i] = temp;
                } else {
                    nums1[i] = digitToMerge;
                    break;
                }
            }
            n-=1;
        }
    }
}