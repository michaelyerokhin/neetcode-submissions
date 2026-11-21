class Solution:

    def encode(self, strs: List[str]) -> str:
        output = ""
        for item in strs:
            output += item + str(0) + str(0) + str(len(item))  
        print(output)
        return output

    def decode(self, s: str) -> List[str]:
        output = []
        i = len(s) - 1
        endpoint = 0
        while i >= 0:
            curr_len = int(s[i-2:i+1])
            if curr_len > 99:
                endpoint = i - 4
            elif curr_len > 9:
                endpoint = i - 3
            else:
                endpoint = i - 2
            output.append(s[endpoint-curr_len:endpoint])
            i = endpoint-curr_len - 1
        return output[::-1]
    

