class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        most_frequent_element = defaultdict(int)
        most_frequent_element[nums[0]] += 1
        freq = nums[0]
        for i in range(1, len(nums)):
            if nums[i] != freq:
                most_frequent_element[freq] -= 1
                if most_frequent_element[freq] == 0:
                    most_frequent_element[nums[i]] +=1
                    freq = nums[i]
            else:
                most_frequent_element[freq] += 1
        return freq


            
        