class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mappings = defaultdict(int)
        res = []
        for num in nums:
            mappings[num] += 1
        tuples = sorted(mappings.items(), key=lambda kv: kv[1], reverse=True)
        i = 0
        while i < k:
            res.append(tuples[i][0])
            i+=1
        return res