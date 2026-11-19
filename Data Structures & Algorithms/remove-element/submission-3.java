class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        int k = 0;
        while (start <= end){
            if (nums[start] == val && nums[end] == val){
                end -= 1;
            } else if (nums[start] == val){
                int temp = nums[end];
                nums[start] = temp;
                nums[end] = val;
                start += 1;
                end -= 1;
                k += 1;
            } else if (nums[end] == val) {
                end -= 1;
            } else {
                start += 1;
                k += 1;
            }
        }
        return k;
    }
}