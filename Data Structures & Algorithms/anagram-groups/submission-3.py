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
        for vals in anagram_map.values():
            output.append(vals)
        return output
