class Solution {
    public void sortColors(int[] nums) {
        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 0; i < nums.length-1; i++){
                if (nums[i] > nums[i+1]){
                    int placeholder = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = placeholder;
                    swap = true;
                }
            }
        }
    }
}