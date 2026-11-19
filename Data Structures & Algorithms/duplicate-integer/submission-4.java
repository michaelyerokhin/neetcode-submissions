class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2){
            return false;
        }
        Arrays.sort(nums);
        int forward = 1;
        int backward = 0;
        while (forward != nums.length){
            if (nums[forward] == nums[backward]){
                return true;
            }
            backward += 1;
            forward += 1;   
        }
        return false;
    }
}