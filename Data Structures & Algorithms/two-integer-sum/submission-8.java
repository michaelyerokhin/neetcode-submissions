class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            if (numbers.containsKey(result)){
                return new int []{numbers.get(result),i};
            } 
            numbers.put(nums[i],i);
        }
        return new int [1];
    }
}
