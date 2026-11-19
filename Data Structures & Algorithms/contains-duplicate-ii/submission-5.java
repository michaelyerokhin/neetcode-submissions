class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> mapper = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (mapper.get(nums[i]) != null){
                for (int j : mapper.get(nums[i])){
                    if (Math.abs(i - j) <= k){
                        return true;
                    }
                }
                mapper.get(nums[i]).add(i);
            } else {
                mapper.putIfAbsent(nums[i], new ArrayList<>()); 
                mapper.get(nums[i]).add(i); 
            }
        }
        return false;
    }
}