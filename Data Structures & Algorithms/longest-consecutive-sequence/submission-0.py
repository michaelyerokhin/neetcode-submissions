class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        mapping = defaultdict(int)
        res = 0
        for i in range(len(nums)):
            if (mapping.get(nums[i] , 0) == 0):
                mapping[nums[i]] = ((mapping.get(nums[i] + 1, 0) + mapping.get(nums[i] - 1, 0)) + 1)
                mapping[nums[i] - mapping[nums[i] - 1]] = mapping[nums[i]] 
                mapping[nums[i] + mapping[nums[i] + 1]] = mapping[nums[i]] 
                res = max(res, mapping[nums[i]])
        return res

        