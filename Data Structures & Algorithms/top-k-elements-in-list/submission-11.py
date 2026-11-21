class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums = sorted(nums)
        frequencyMapping = defaultdict(list)
        curr = nums[0] #1
        count = 0
        for i in range(len(nums)):
            if (nums[i] == curr):
                count+=1
            else:
                frequencyMapping[count].append(curr)
                count = 1
                curr = nums[i]
        frequencyMapping[count].append(curr)
        
        x = 0
        output = []
        for key, value in reversed(sorted(frequencyMapping.items())):
            for item in value:
                if x == k:
                    return output
                else:
                    output.append(item)
                    x+=1
        return output




                


