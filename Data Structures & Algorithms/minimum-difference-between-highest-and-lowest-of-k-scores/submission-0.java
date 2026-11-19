class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = k-1;
        int currMin = nums[nums.length - 1];
        while (end != nums.length){
            currMin = Math.min(currMin, nums[end] - nums[start]);
            end += 1;
            start += 1;
        }
        return currMin; 
    }
}