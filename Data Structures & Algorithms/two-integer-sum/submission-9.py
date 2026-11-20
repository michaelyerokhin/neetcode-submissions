class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}
        for index, val in enumerate(nums):
            goal = target - val
            if goal in prevMap:
                return [prevMap[goal], index]
            prevMap[val] = index
