class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2){
            return false;
        } else {
            int j = 1;
            for (int i = 0; i < nums.length; i++){
                if (j == nums.length){
                    return false;
                }
                if (nums[i] == nums[j]){
                    return true;
                }
                j+=1;
            }
            return false;
        }
    }
}