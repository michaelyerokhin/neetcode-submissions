class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = {}
        for word in strs:
            sortedWord = "".join(sorted(word))
            if sortedWord in anagram_map:
                anagram_map[sortedWord].append(word)
            else:
                anagram_map[sortedWord] = [word]
        output = []
        return list(anagram_map.values())
