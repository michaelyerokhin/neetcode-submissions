class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int longestDuration = 0;
        int mostCommonNumber = 0;
        int currentNum = nums[0];
        int currentDuration = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == currentNum){
                currentDuration += 1;
            } 
            if (i == nums.length - 1 || nums[i] != currentNum ){
                if (currentDuration > longestDuration){
                    mostCommonNumber = currentNum;
                    longestDuration = currentDuration;
                }
                currentDuration = 1;
                currentNum = nums[i];
            }
        }
        return mostCommonNumber;
    }
}